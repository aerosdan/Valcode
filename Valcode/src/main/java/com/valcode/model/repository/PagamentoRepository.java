package com.valcode.model.repository;

import com.valcode.model.entity.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PagamentoRepository extends JpaRepository <Pagamentos, Integer> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM PAGAMENTOS WHERE pagamentos_doc_cli = ?1"
    )
    List<Pagamentos> getByDocCli(String docCli);

}
