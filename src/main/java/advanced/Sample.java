package advanced;

import java.text.NumberFormat;
import java.util.Date;

public class Sample {

    public static void main(String[] args) {
        Date birthday = new Date();

        Date deadline = new Date();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        if(birthday == deadline) {
            System.out.println("birthday == deadline");
        }

        if(birthday.equals(deadline)) {
            System.out.println("birthday equals deadline");
        }

        deadline = birthday;

        if(birthday == deadline) {
            System.out.println("birthday == deadline after assignment");
        }

        if(birthday.equals(deadline)) {
            System.out.println("birthday equals deadline");
        }

    }
}
