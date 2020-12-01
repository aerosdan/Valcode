package com.valcode.model.repository;

import com.valcode.model.entity.Pagamentos;
import com.valcode.service.PagamentoCriteria;
import com.valcode.service.PagamentoFilter;
import com.valcode.service.PagamentoQueryService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PagamentosDAO {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Pagamentos> searchPagamentos(PagamentoCriteria params){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Pagamentos> query = builder.createQuery(Pagamentos.class);
        Root r = query.from(Pagamentos.class);

        Predicate predicate = builder.conjunction();
        PagamentoQueryService pagamentoCriteria = new PagamentoQueryService(predicate, builder, r);
        pagamentoCriteria.accept(params);
        predicate = pagamentoCriteria.getPredicate();
        query.where(predicate);

        List<Pagamentos> result = entityManager.createQuery(query).getResultList();
        return result;
    }
}
