package java8.lambda;

public class LambdaNumeric {

        public NumericInterface even() {
                return (n) -> (n % 2) == 0;
        }

        public NumericInterface odd() {
            return (n) -> (n%2) != 0;
        }
}
