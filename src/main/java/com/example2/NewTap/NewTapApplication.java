package com.example2.NewTap;

import com.example2.NewTap.student.StudentClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController
public class NewTapApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewTapApplication.class, args);
	}
}
