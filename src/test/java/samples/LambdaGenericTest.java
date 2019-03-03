package samples;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java8.lambda.LambdaGeneric;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LambdaGenericTest {

    LambdaGeneric lambdaGeneric;
    List<Integer> array;

    @BeforeMethod
    public void before() throws Exception {
        lambdaGeneric = new LambdaGeneric();
        array = new ArrayList<>();
        array.add(4);
        array.add(10);
        array.add(9);
        array.add(5);
        array.add(6);
    }

    @Test
    public void test() throws Exception {
        assertThat(lambdaGeneric.maximum().compute(array)).isEqualTo(10);
        assertThat(lambdaGeneric.maxAltMethod().compute(array)).isEqualTo(10);
    }
}
