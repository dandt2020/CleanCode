package com.luvina.dandt.utils;

public class Constant {
    public static final String PATTERN_DATE;
    public static final String COMMA_DELIMITER;
    public static final String FILE_NAME;
    public static final long MILLIS_OF_YEAR;

    static {
        COMMA_DELIMITER = ",";
        FILE_NAME = "employee.csv";
        PATTERN_DATE = "yyyyMMdd";
        MILLIS_OF_YEAR = 31556952000L;
    }
}
