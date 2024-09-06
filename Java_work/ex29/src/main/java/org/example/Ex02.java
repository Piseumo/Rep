package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(localDate.getYear(), 12, 25);

        Period period = Period.between(localDate, localDate1);

        System.out.println("Month"+period.getMonths());
        System.out.println("Days"+period.getDays());
    }
}