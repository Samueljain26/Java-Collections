package com.bridgelabz.mapinterface;
import java.util.*;
public class GroupObject {
    public static void main(String[] args) {
        Map<String, LinkedList<Employee>> departmentMap = new HashMap<>();

        // Adding employees
        addEmployee(departmentMap, new Employee("A", "Accounts"));
        addEmployee(departmentMap, new Employee("B", "Management"));
        addEmployee(departmentMap, new Employee("C", "HR"));
        addEmployee(departmentMap, new Employee("D", "Finance"));

        System.out.println("Grouped Employees by Department:");
        for (Map.Entry<String, LinkedList<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Employee class
    static class Employee {
        private String name;
        private String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // Method to add employees to the map
    static void addEmployee(Map<String, LinkedList<Employee>> departmentMap, Employee employee) {
        departmentMap.putIfAbsent(employee.getDepartment(), new LinkedList<>());
        departmentMap.get(employee.getDepartment()).add(employee);
    }
}
/*Grouped Employees by Department:
Finance: [D]
HR: [C]
Management: [B]
Accounts: [A]
 */