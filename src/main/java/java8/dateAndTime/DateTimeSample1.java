package java8.dateAndTime;

import java.time.*;

public class DateTimeSample1 {

    public static void main(String[] args) {

        System.out.println("Instant :"+ Instant.now());
        System.out.println("LocalDate :"+ LocalDate.now());
        System.out.println("LocalTime :" + LocalTime.now());
        System.out.println("LocalDateTime :"+ LocalDateTime.now());
        System.out.println("ZonedDateTime :"+ ZonedDateTime.now());
    }
}
