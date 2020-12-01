package com.valcode.model.entity;

import lombok.*;

import javax.persistence.*;
//import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="nome")
//    @NotEmpty(message = "{campo.login.obrigatorio}")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(unique=true,name = "email")
    private String cpf;

    @Column(name = "nascimento")
    private String nascimento;

    @Column(unique=true,name = "cpf")
    private String username;

    @Column(name = "senha")
    private String senha;

    
////    @ManyToOne
////    @JoinColumn(name = "pagamento_cod_mdl", referencedColumnName = "MODALIDADE_COD_MODALIDADE")
//    @Column(name = "pagamentos_cod_mdl")
//    private String cod_mdl;

    public Usuario(String nome, String sobrenome, String cpf, String nascimento, String username, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.username = username;
        this.senha = senha;
        
    }
}
