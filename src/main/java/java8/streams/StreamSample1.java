package java8.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamSample1 {

    public void filerMethod(List<String> string) {
        string.stream().filter((s) -> s.startsWith("t")).forEach(System.out::println);
    }

    public List<String> sortMethod(List<String>string) {
        return string
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .map((s) -> s.concat("test+"))
                .collect(Collectors.toList());
    }

    public void filter2(List<String> names , Predicate condition) {
        names
                .stream()
                .filter((name) -> (condition.test(name)))
                .forEach(name -> System.out.println(name +" "));
    }
}
