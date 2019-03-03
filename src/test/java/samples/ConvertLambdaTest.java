package samples;

import org.testng.annotations.Test;
import java8.lambda.LambdaConvert;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertLambdaTest {

    LambdaConvert lambdaConvert = new LambdaConvert();

    @Test
    public void test() throws Exception {
        assertThat(lambdaConvert.convertMethod().convert("123")).isEqualTo(123);
    }
}
