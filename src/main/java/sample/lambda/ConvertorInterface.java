package sample.lambda;

@FunctionalInterface
public interface ConvertorInterface<F,T> {

    T convert(F from);
}
