package com.desafio.apirest.models.local;

import lombok.Data;

import java.util.List;

@Data
public class ComicsResult {
    private List<ComicsMarvel> results;
}
