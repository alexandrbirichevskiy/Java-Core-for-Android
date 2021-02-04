package com.alexbirichevskiy.homework_5;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 5;
        Employee[] empArray = new Employee[SIZE];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Bober Arkadiy", "Analyst", "bober@gmail.com", "89213451364", 45000.5, 41);
        empArray[2] = new Employee("Karpov Ilya", "Developer", "karpov@gmail.com", "89213242312", 145000.8, 50);
        empArray[3] = new Employee("Petrov Vasya", "DS", "pv@gmail.com", "89651234545", 175000, 28);
        empArray[4] = new Employee("Vasina Olya", "HR", "v.olya@mail.ru", "89653415612", 54000.1, 35);


        for (int i = 0; i < SIZE; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].printInfo();
                System.out.println();
            }
        }
    }
}
