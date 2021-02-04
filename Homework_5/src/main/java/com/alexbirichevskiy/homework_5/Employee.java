package com.alexbirichevskiy.homework_5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    Employee(String name, String position, String email, String phoneNumber, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo(){
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
