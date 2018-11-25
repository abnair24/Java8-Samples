package sample.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalRecipes {

    public static void main(String[] args) {
        Optional<String> odd = Stream.of("five","four","even","string")
                .filter(s->s.length() %2 !=0)
                .findFirst();

        odd.ifPresent(System.out::println);
        System.out.println(odd.orElse("No match"));

    }
}
