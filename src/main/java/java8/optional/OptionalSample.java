package java8.optional;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {

        // Case 1: isPresent()
        String[] str = new String[10];

        Optional<String> isNull = Optional.ofNullable(str[9]);

        if(isNull.isPresent()) {
            String str2 = str[9].substring(2,5);
            System.out.println(str2);
        } else {
            System.out.println("Empty");
        }

        str[9] = "DummyWordPresent";
        Optional<String>isNull2 = Optional.ofNullable(str[9]);
        if(isNull2.isPresent()) {
            String str2 = str[9].substring(2,5);
            System.out.println(str2);
        } else {
            System.out.println("Empty string");
        }


        // Case2: ifPresent()

        Optional<String> got = Optional.of("Game of thrones");
        Optional<String> nothing = Optional.empty();

        got.ifPresent(System.out::println);

        //Wont print as nothing is empty
        nothing.ifPresent(System.out::println);

        //Case 3: Map ,Flatmap

    }




}
