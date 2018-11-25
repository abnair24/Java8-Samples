package samples;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample.streams.Gender;
import sample.streams.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonStreamTest {

    List<Person> people;
    Person p1,p2,p3,p4,p5;

    @BeforeMethod
    public void before() throws Exception {
        p1 = new Person(Gender.MALE,"Person1");
        p2 = new Person(Gender.MALE,"Person2");
        p3 = new Person(Gender.FEMALE,"Person3");
        p4 = new Person(Gender.FEMALE,"Person4");
        p5 = new Person(Gender.FEMALE,"Person5");

        people = new ArrayList<>();
        people.addAll(Arrays.asList(new Person[]{p1,p2,p3,p4,p5}));
    }

    @Test
    public void test() throws Exception {
        List<String>names = people
                .stream()
                .filter(p ->p.getGender() == Gender.FEMALE)
                .map(Person::getName)
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        assertThat(names).containsOnly("PERSON3","PERSON4","PERSON5");
    }

    @Test
    public void test1() throws Exception{
        Map<String,Person> nameMap = people
                .stream()
                .collect(Collectors.toMap(p ->p.getName(),p->p));

        System.out.println(nameMap);
    }
}
