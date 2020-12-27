package com.luvina.dandt;

public class Main {

    public static void main(String[] args) throws Exception {
        var monthlyUsage = new MonthlyUsage(100, 500);
        var customer = new PayAsYouGo(monthlyUsage);

        customer.generate();

        System.out.println(customer.statement.TotalCost);
    }
}
