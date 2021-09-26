package com.example.Humana;

import com.example.Humana.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class HumanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanaApplication.class, args);
	}

}




