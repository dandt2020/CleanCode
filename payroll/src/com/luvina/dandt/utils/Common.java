package com.luvina.dandt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    private Common() {
        throw new IllegalStateException("Utility class");
    }

    public static Date convertStringToDate(String str) throws ParseException {
        return new SimpleDateFormat(Constant.PATTERN_DATE).parse(str);
    }

    public static long getMillisBetweenTwoDate(Date d1, Date d2){
        return d1.getTime() - d2.getTime();
    }

    /**
     * calculation current salary
     * @return double
     */
    public static double calculateSalary(float workingYears, long startSal){
        return Math.pow(1 + 0.06, workingYears) * startSal;
    }
}
