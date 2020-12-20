package com.luvina.dandt;

import com.luvina.dandt.entities.Employee;
import com.luvina.dandt.service.EmployeeService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeService empService = new EmployeeService();
        List<Employee> employees = empService.parseCsv();

        for (Employee emp : employees) {
            System.out.println("Age of " + emp.getName() + ": " + emp.getAge());
            System.out.println("Working time: " + (int) (emp.getWorkingYears()) + " years "
                    + (int) ((emp.getWorkingYears() % 1) * 12) + " months");
            System.out.println("Current salary: " +  (int) emp.getCurrentSalary());
        }
    }
}
