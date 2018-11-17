package sample.lambda;

@FunctionalInterface
public interface GenericInterface<T> {
    T compute(T t);
}
