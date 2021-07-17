package com.desafio.apirest.repository;
import com.desafio.apirest.models.local.ComicsData;
import com.desafio.apirest.models.local.ComicsMarvel;
import com.desafio.apirest.models.remote.Comic;
import org.springframework.cloud.commons.publisher.CloudFlux;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.util.concurrent.MonoToListenableFutureAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface ComicsRepository {

    @GetMapping()
    public Comic getComics();



}
