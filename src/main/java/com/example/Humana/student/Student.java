package com.example.Humana.student;

import java.time.LocalDate;

public class Student {
    private String name ;
    private int age;
    private int grade;
    private LocalDate dob;
    private String email;
    private long id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, int age, int grade, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.dob = dob;
        this.email = email;
    }

    public Student(String name,
                   int age,
                   int grade,
                   LocalDate dob,
                   String email,
                   long id) {

        this.name = name;
        this.age = age;
        this.grade = grade;
        this.dob = dob;
        this.email = email;
        this.id = id;
    }

    public Student() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
