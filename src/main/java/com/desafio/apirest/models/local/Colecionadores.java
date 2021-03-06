package com.desafio.apirest.models.local;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


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
    private String meuComic;

    public long getId() {
        return id;
    }

    public Colecionadores setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Colecionadores setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Colecionadores setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Colecionadores setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Colecionadores setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getMeuComic() {
        return meuComic;
    }

    public Colecionadores setMeuComic(String meuComic) {
        this.meuComic = meuComic;
        return this;
    }

    public Colecionadores(long id, String name, String email, String cpf, LocalDate date, String meuComic) {
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
        return getId() == that.getId() && Objects.equals(getName(), that.getName()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(getDate(), that.getDate()) && Objects.equals(getMeuComic(), that.getMeuComic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getCpf(), getDate(), getMeuComic());
    }

    @Override
    public String toString() {
        return "Colecionadores{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", date=" + date +
                ", meuComic='" + meuComic + '\'' +
                '}';
    }
}
