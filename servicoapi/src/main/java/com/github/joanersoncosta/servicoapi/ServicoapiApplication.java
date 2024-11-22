package com.github.joanersoncosta.servicoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Tag(name = "ClienteAPI", description = "Controle responsavel pelas operações do cliente.")
@RestController
@RequestMapping("/teste")
@SpringBootApplication
public class ServicoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoapiApplication.class, args);
	}
	
	@GetMapping
	public String getHome() {
		log.info("[start ServicoapiApplication - getHome]");
		return "Teste home";
	}

}
