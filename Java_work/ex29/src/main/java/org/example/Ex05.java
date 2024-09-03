package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd hh mm ss");
        System.out.println(dtf.format(now));
    }
}
