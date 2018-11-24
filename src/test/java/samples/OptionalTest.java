package samples;

import org.assertj.core.util.Lists;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

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
}
