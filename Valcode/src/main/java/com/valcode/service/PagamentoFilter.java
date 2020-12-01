package com.valcode.service;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class PagamentoFilter {
    private String docCli;
    private String tipCli;
    private String datPgt;
    private String datVct;


}
