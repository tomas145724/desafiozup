package com.desafio.apirest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class ApiRestApplication {


	public static void main(String[] args) throws Exception{
		SpringApplication.run(ApiRestApplication.class, args);

	}


}
