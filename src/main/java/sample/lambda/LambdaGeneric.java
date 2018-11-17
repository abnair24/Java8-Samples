package sample.lambda;

import java.util.Collections;
import java.util.List;

public class LambdaGeneric {

    public LambdaGenericInterface<Integer, List<Integer>> maximum() {
        return (numbers) -> Collections.max(numbers);
    }

    public LambdaGenericInterface<Integer,List<Integer>>maxAltMethod() {
        return Collections::max;

    }
}
