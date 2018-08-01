package com.company;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee (String name , int age , int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void showDetail()   {
        System.out.println("name: "+ this.name+"age: "+this.age+"salary: "+this.salary);

    }

}
