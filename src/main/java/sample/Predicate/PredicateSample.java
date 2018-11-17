package sample.Predicate;

import java.util.function.Predicate;

public class PredicateSample {

    Predicate<String> names = name->name.startsWith("A");
}
