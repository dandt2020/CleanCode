package com.luvina.dandt;

public class Customer {
    public MonthlyStatement statement;
    public MonthlyUsage usage;

    public void generate() throws Exception {
        throw new Exception("The current customer type is not supported");
    }
}
