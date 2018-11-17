package samples.lambda;

import org.testng.annotations.Test;
import sample.lambda.LambdaGenericImpl;

import static org.assertj.core.api.Assertions.*;

public class GenericImplLambdaTest {

    LambdaGenericImpl lambdaGeneric = new LambdaGenericImpl();

    @Test
    public void test() throws Exception {
        assertThat(lambdaGeneric.reverseString().compute("Aswathy")).hasToString("yhtawsA").hasSize(7);
        assertThat(lambdaGeneric.factorialInteger().compute(5)).isEqualTo(120);
    }
}
