package com.luvina.dandt;

public class PayAsYouGo extends Customer{

    public PayAsYouGo(MonthlyUsage monthlyUsage) {
        this.usage = monthlyUsage;
        this.statement = new MonthlyStatement();
    }

    @Override
    public void generate() throws Exception {
        statement.CallCost = 0.12f * usage.CallMinutes;
        statement.SmsCost = 0.12f * usage.SmsCount;
        statement.TotalCost = statement.CallCost + statement.SmsCost;
    }
}
