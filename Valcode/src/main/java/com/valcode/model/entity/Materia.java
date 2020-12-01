package com.valcode.model.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Materia {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Column(name="mat_valor_min")
    private Double valor_minimo;
    
    @Column(name="mat_titulo")
    private String mat_titulo;

    @Column(name="mat_txt", length=999)
    private String mat_txt;
        
    @Column(name="mat_foto")
    private String mat_foto;
}
