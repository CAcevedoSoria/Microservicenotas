package com.example.demo.controller;

import com.example.demo.model.Notas;
import com.example.demo.service.NotasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class NotasController {


	@Autowired
	private NotasService notasService;

	@GetMapping("/listar")
	public List<Notas> listar(){
		return notasService.findAll();
	}

}
