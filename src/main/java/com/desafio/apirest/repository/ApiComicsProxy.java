package com.desafio.apirest.repository;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "api-comics", url = "${marvel.url}" )
public interface ApiComicsProxy extends  ComicsRepository{
}
