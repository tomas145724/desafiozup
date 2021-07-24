package com.desafio.apirest.controller;

import com.desafio.apirest.models.local.Colecionadores;
import com.desafio.apirest.models.local.ComicsData;
import com.desafio.apirest.models.local.ComicsMarvel;
import com.desafio.apirest.models.remote.Comic;
import com.desafio.apirest.repository.ApiComicsProxy;
import com.desafio.apirest.repository.ColecionadoresRepository;
import com.desafio.apirest.repository.ComicsRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.publisher.CloudFlux;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST COMICS COLECIONADORES")
@EnableFeignClients(basePackageClasses = ApiComicsProxy.class)
public class ApiController implements ComicsRepository{


    @Autowired
    private ColecionadoresRepository colecionadoresRepository;

    @Autowired
    private ApiComicsProxy proxy;
    public ApiController(ApiComicsProxy proxy){
        this.proxy = proxy;
    }

    public ApiController() {
    }

    @GetMapping(path = "/colecionadores")
    @ApiOperation(value = "Retorna a lista de colecionadores")
    @JsonIgnore
    public List<Colecionadores> listaColecionadores(){

        return colecionadoresRepository.findAll();
    }

    @GetMapping("/colecionadores/{id}")
    @ApiOperation(value = "Retorna o id procurado")

    public Colecionadores buscaColecionadores(@PathVariable(value = "id") long id){

        return colecionadoresRepository.findById(id);
    }



    @PostMapping("/colecionadores")
    @ApiOperation(value = "Realiza o cadastra de um novo colecionador")
    public Colecionadores salvaColecionador(@RequestBody Colecionadores colecionador){

        return colecionadoresRepository.save(colecionador);
    }



    @Override
    @GetMapping("/v1/public/comics/")
    public Comic getComics() {
         
        return proxy.getComics();
    }

    /*@DeleteMapping("/colecionadores")
    @ApiOperation(value = "Deleta o cadastro de um colecionador")
    public void deletaColecionador(@RequestBody Colecionadores colecionador){
        colecionadoresRepository.delete(colecionador);
    }
    @PutMapping ("/colecionadores")
    @ApiOperation(value = "Atualiza os dados de um colecionadore")
    public Colecionadores atualizarColecionador(@RequestBody Colecionadores colecionador){
        return colecionadoresRepository.save(colecionador);
    }*/















}
