package com.desafio.apirest.models;

import lombok.Data;

import java.util.List;

@Data
public class ComicsResult {
    private List<ComicsMarvel> results;
}
