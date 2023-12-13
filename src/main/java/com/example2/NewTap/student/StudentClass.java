package com.example2.NewTap.student;

import java.time.LocalDate;

public class StudentClass {

    private Long id;
    private  LocalDate dob;
    private String mail;
    private String firstName;
    private String lastName;
    private String sex;
    private int age;

    public StudentClass(Long id, LocalDate dob, String mail, String firstName, String lastName, String sex, int age) {
        this.id = id;
        this.dob = dob;
        this.mail = mail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public StudentClass(LocalDate dob, String mail, String firstName, String lastName, String sex, int age) {
        this.dob = dob;
        this.mail = mail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", dob=" + dob +
                ", mail='" + mail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
