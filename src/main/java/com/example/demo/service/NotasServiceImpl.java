package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.model.Notas;
import com.example.demo.model.Student;
import com.sun.org.apache.bcel.internal.generic.L2I;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NotasServiceImpl implements NotasService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Notas> findAll() {

		List<Course> courses= Arrays.asList(clienteRest.getForObject("http://localhost:6000/", Course[].class));
		List<Student> students =  Arrays.asList(clienteRest.getForObject("http://localhost:5000/",Student[].class));

		return courses.stream().map(p-> new Notas(p ,students)).collect(Collectors.toList());
	}




}

