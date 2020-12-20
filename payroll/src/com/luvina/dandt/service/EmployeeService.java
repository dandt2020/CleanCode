package com.luvina.dandt.service;

import com.luvina.dandt.entities.Employee;
import com.luvina.dandt.utils.Common;
import com.luvina.dandt.utils.Constant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public String[] parseCsvLine(String csvLine) {
        String[] splitData = null;
        if (csvLine != null) {
            splitData = csvLine.split(Constant.COMMA_DELIMITER);
        }
        return splitData;
    }

    public List<Employee> parseCsv() {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Constant.FILE_NAME))) {
            String line;

            // read header
            line = br.readLine();
            // read data
            while ((line = br.readLine()) != null) {
                Employee emp = new Employee();
                String[] data = parseCsvLine(line);
                int index = 0;
                emp.setName(data[index++]);
                emp.setDob(Common.convertStringToDate(data[index++]));
                emp.setRole(data[index++]);
                emp.setStartDate(Common.convertStringToDate(data[index++]));
                emp.setStartSal(Long.parseLong(data[index++]));
                employees.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
