package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

//@Getter
//@Setter
@Data
@Document(collection = "Students")
public class Student {

	private String fullName;
	private String academicPeriod;
	private String document;


}
