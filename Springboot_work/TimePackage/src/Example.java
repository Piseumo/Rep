import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Example {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        DayOfWeek yoil = today.getDayOfWeek();
        Month month2 = today.getMonth();


        System.out.println("year :" + year);
        System.out.println("month :" + month);
        System.out.println("월 이름: " + month2);
        System.out.println("월 이름: " + month2.getValue());
        System.out.println("day : " + day);
        System.out.println("요일 : "+yoil);
        System.out.println("요일 : "+yoil.getValue());




    }

}
