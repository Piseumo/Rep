package org.example;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("loacalDate : "+localDate);

        LocalDate localDate1 = LocalDate.of(localDate.getYear(),12,25);

        System.out.println("minusday(1) = " + localDate1.minusDays(1));
        System.out.println("localday(2) = " + localDate1.plusDays(2));
    }
}
