package com.example.Humana.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        "Saroj",
                        25,
                        13,
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "khatrisaroj@gmail.com",
                        1l
                )
        );
    }
}
