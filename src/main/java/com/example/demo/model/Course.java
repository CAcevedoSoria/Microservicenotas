package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Course {
	@Id private String idCourse;
	private String nameCourse;
	private String status;
	private String quotaMin;
	private String quotaMax;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private String document;
	private String dniteacher;
}
