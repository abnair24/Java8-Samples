package samples;

import org.assertj.core.util.Lists;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java8.optional.Modem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalTest {

    List<String> words;

    @BeforeMethod
    public void before() throws Exception {
        words =  Lists.newArrayList();
    }

    @Test
    public void test() throws Exception {

        Optional<String> month = Optional.of("october");
        Optional<String> nothing = Optional.ofNullable(null);

        month.ifPresent(words::add);
        nothing.ifPresent(words::add);

        assertThat(month.toString()).isEqualToIgnoringCase("Optional[october]");
        assertThat(words.size()).isOne();
        assertThat(words.get(0)).hasToString("october");
    }

    @Test
    public void test1() throws Exception {

        Optional<String> number = Optional.of("longword");
        Optional<String> nonum = Optional.empty();

        Optional<String> smallWord = number.map(s -> s.substring(0,4));
        Optional<String> nothing = nonum.map(s -> s.substring(0,4));

        assertThat(smallWord.get()).hasToString("long");
        assertThat(nothing.isPresent()).isFalse();
    }

    @Test
    public void test2() throws Exception {
        Optional<Integer>number =Optional.of(10);

        Optional<Integer>filterout = number.filter(n -> n >100);
        Optional<Integer> filterin = number.filter(n -> n<100);

        assertThat(filterout.isPresent()).isFalse();
        assertThat(filterin.isPresent()).isTrue();
    }

    @Test
    public void test3() throws Exception {
        List<String> numbers = Arrays.asList("1",null,"2","3","1",null);

        List<Optional<String>> num = numbers
                .stream()
                .map(Optional::ofNullable)
                .collect(Collectors.toList());

        System.out.println(num);
    }

    /*
    OrElse triggers call to default method even when field is not null thus creating an object which is not used.
     */
    @Test
    public void orElseGetAndOrElseTest() throws Exception {

        String text = "Value";
        System.out.println("OrElseGet");
        String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        assertThat(defaultText).hasToString("Value");

        System.out.println("OrElse");
        defaultText = Optional.of(text).orElse(getMyDefault());
        assertThat(defaultText).hasToString("Value");

    }


    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    @Test
    public void filterWithOptionalTest() throws Exception {
        assertThat(Modem.isInRange(new Modem(13.0))).isTrue();
        assertThat(Modem.isInRange(new Modem(16.0))).isTrue();
    }
}
