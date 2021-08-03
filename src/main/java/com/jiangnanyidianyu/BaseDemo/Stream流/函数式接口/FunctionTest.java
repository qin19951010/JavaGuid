package com.jiangnanyidianyu.BaseDemo.Stream流.函数式接口;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionTest {
    //定义了一个方法和函数式接口run对应
    public static String DateFormat(LocalDateTime dateTime, String partten) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(partten);
        return dateTime.format(dateTimeFormatter);
    }
}

