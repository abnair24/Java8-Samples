package sample.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeCalSample {

    public static void main(String[] args) {
        calendarMethod();
        DateTimeCalSample timeDateSample = new DateTimeCalSample();
        timeDateSample.dateTimeWeekMethod("08241986");

        timeDateSample.dateTimeFormatMethod();

    }

    /*
    Calendar related objects are immutable
     */
    public static void calendarMethod() {
        LocalDate date = LocalDate.of(2018,12,7);
        Period period = Period.ofDays(12);
        System.out.println(date);
        date.plus(period);
        System.out.println(date);

        LocalDate date1 = date.plus(period);
        System.out.println(date1);

        /*
        LocalDate is a factory class which has factory methods for instantiation.Using "new" keyword wont compile.
         */
        // LocalDateTime localDate = new LocalDateTime();

        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

    }

    public void dateTimeWeekMethod(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate date = null;

        date = LocalDate.parse(charSequence,dateTimeFormatter);

        System.out.println("date :"+date);
        System.out.println(date.getDayOfWeek());

        Period period = Period.between(date,LocalDate.now());

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }

    public void dateTimeFormatMethod() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("E MMM dd,yyyy G");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("k:m:s A a");

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate.format(dateTimeFormatter));
        System.out.println(localDate.format(dateTimeFormatter1));
        System.out.println(localDateTime.format(dateTimeFormatter2));

    }
}
