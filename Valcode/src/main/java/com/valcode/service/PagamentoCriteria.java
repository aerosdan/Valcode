package com.valcode.service;

import com.valcode.model.entity.Pagamentos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import java.util.function.Predicate;
@Getter
@Setter
@AllArgsConstructor
public class PagamentoCriteria {
    private String key;
    private String operation;
    private Object value;
}
