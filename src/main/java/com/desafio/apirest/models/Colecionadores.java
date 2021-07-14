package com.desafio.apirest.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


// MAPEAR COM A TABELA COM O BANCO DE DADOS
// @TABLE VOCE VAI PERSONALISAR O NOME DA TABELA, SE NÃO COLOCASSE IRIA FICAR COM O NOME DA CLASSE
@Entity
@Table (name = " TB_COLECIONADORES ")
public class Colecionadores {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column (nullable = false,length = 50)
    private String name;

    @Column (nullable = false,length = 50, unique = true)
    private String email;

    @Column (nullable = false,length = 14, unique = true)
    private String cpf;

    @Column (nullable = false,length = 10)
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

   @Column
    private ArrayList<Long> meuComic;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ArrayList<Long> getMeuComic() {
        return meuComic;
    }

    public void setMeuComic(ArrayList<Long> meuComic) {
        this.meuComic = meuComic;
    }

    public Colecionadores(long id, String name, String email, String cpf, LocalDate date, ArrayList<Long> meuComic) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.date = date;
        this.meuComic = meuComic;
    }

    public Colecionadores() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Colecionadores)) return false;

        Colecionadores that = (Colecionadores) o;

        return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName()).append(getEmail(), that.getEmail()).append(getCpf(), that.getCpf()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).append(getName()).append(getEmail()).append(getCpf()).toHashCode();
    }



}
