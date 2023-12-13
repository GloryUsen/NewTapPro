package com.example2.NewTap.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/studentClass")
public class StudentController {

    @GetMapping
    public List<StudentClass> getStudentClass(){
        return List.of(
                new StudentClass(
                        1L,
                        LocalDate.of(2000, Month.MAY, 24),
                        "ganwana89@gmail.com",
                        "Glory",
                        "Anwana",
                        "Female",
                        21
                )
        );
    }

}
