package samples.lambda;

import org.testng.annotations.Test;
import sample.lambda.LambdaNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class NumericLambdaTest {

    LambdaNumeric lambdaNumeric = new LambdaNumeric();

    @Test
    public void test() throws Exception {
        assertThat(lambdaNumeric.even().compute(5)).isFalse();
        assertThat(lambdaNumeric.odd().compute(5)).isTrue();
    }
}