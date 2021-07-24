package com.desafio.apirest.repository;

import com.desafio.apirest.models.local.Colecionadores;
import com.desafio.apirest.models.local.ComicsMarvel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public interface ColecionadoresRepository extends JpaRepository<Colecionadores, Integer> {

    Colecionadores findById(long id);


}
