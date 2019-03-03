package java8.lambda;

@FunctionalInterface
public interface GenericInterface<T> {
    T compute(T t);
}
