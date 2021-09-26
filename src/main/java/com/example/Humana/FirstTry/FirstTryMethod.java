//package com.example.Humana.FirstTry;
//
//import com.example.Humana.student.Student;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@RestController
//public class FirstTryMethod {
//    	@GetMapping
//	public String hello() {
//		return "Welcome to Java world";
//	}
//
//	@GetMapping
//	public List<String> helloo() {
//		return List.of("Hello" , "World");
//	}
//
//    @GetMapping
//    public List<Student> greeting() {
//        return List.of(
//                new Student(
//                        "Saroj",
//                        25,
//                        13,
//                        LocalDate.of(2000, Month.JANUARY, 5),
//                        "khatrisaroj@gmail.com",
//                        1l
//                )
//        );
//    }
//}
