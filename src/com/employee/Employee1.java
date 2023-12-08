package com.employee;

public class Employee1 {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int employeeCheck = (int) Math.floor(Math.random()*10)%3;
        System.out.println(employeeCheck);
        int dailyWage = 0;

        switch (employeeCheck){
            case IS_PART_TIME:
                dailyWage =PART_TIME_HOUR * WAGE_PER_HOUR;
                System.out.println("Employee is part time ");
                break;
            case IS_FULL_TIME:
                dailyWage =FULL_DAY_HOUR * WAGE_PER_HOUR;
                System.out.println("Employee is full time ");
                break;
            default:
                System.out.println("Employee is Absent");
        }
        System.out.println("Employee daily wage is " + dailyWage);
    }
}

