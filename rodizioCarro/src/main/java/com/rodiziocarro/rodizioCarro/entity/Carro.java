package com.rodiziocarro.rodizioCarro.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="carro")
public class Carro implements Serializable {
    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ID;

    @Column
    private String marca;

    @Column
    private String modeloVeiculo;

    @Column
    private String ano;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
