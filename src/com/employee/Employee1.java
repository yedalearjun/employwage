package com.employee;

public class Employee1 {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int employeeCheck = (int) Math.floor(Math.random()*10)%2;
        System.out.println(employeeCheck);
        if (employeeCheck == 1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
