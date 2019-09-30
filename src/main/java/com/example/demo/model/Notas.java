package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Notas")
public class Notas  {

	@Id

	private Course course;
	private List<Student> students;




	public Double getPromedio() {
		return (course.getNota1()+course.getNota2()+course.getNota3())/3;
	}



}

