package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("binh", 18, 1500);
        Employee employee2 = new Employee("tuan", 19, 1400);
        Employee employee3 = new Employee("trung", 29, 1800);
        Employee employee4 = new Employee("chung", 27, 2000);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        for(int i = 0; i < employees.size() ; i++)  {
            employees.get(i).showDetail();
        }
    }
}


