package java8.lambda;

@FunctionalInterface
public interface ConvertorInterface<F,T> {

    T convert(F from);
}
