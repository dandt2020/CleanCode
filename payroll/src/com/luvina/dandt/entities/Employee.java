package com.luvina.dandt.entities;

import com.luvina.dandt.utils.Common;
import com.luvina.dandt.utils.Constant;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private String role;
    private Date startDate;
    private long startSal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getStartSal() {
        return startSal;
    }

    public void setStartSal(long startSal) {
        this.startSal = startSal;
    }

    /**
     * Get age from birthday
     *
     * @return float
     */
    public float getAge() {
        long ageInMillis = Common.getMillisBetweenTwoDate(new Date(), getDob());

        return (ageInMillis * 1f / Constant.MILLIS_OF_YEAR);
    }

    public float getWorkingYears() {
        long workingInMillis = Common.getMillisBetweenTwoDate(new Date(), getStartDate());
        return (workingInMillis * 1f / Constant.MILLIS_OF_YEAR);
    }

    public double getCurrentSalary() {
        int workingYears = (int) getWorkingYears();
        return Common.calculateSalary(workingYears, startSal);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", role='" + role + '\'' +
                ", startDate=" + startDate +
                ", startSal=" + startSal +
                '}';
    }
}
