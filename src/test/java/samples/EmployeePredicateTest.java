package samples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java8.Predicate.Employee;
import java8.Predicate.EmployeePredicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeePredicateTest {

    List<Employee> employees;
    Employee e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;

    @BeforeTest
    public void before() throws Exception {
        e1 = new Employee(1,23,"M","Rick","Beethovan");
        e2 = new Employee(2,13,"F","Martina","Hengis");
        e3 = new Employee(3,43,"M","Ricky","Martin");
        e4 = new Employee(4,26,"M","Jon","Lowman");
        e5 = new Employee(5,19,"F","Cristine","Maria");
        e6 = new Employee(6,15,"M","David","Feezor");
        e7 = new Employee(7,68,"F","Melissa","Roy");
        e8 = new Employee(8,79,"M","Alex","Gussin");
        e9 = new Employee(9,15,"F","Neetu","Singh");
        e10 = new Employee(10,45,"M","Naveen","Jain");

        employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
    }

    @Test
    public void test() throws Exception {
        assertThat(EmployeePredicates
                .filterEmployee(employees,EmployeePredicates.isAdultMale()))
                .containsOnly(e1,e3,e4,e8,e10);

        assertThat(EmployeePredicates
                .filterEmployee(employees,EmployeePredicates.isAdultFemale()))
                .containsOnly(e5,e7);

        assertThat(EmployeePredicates
                .filterEmployee(employees,EmployeePredicates.isAgeMoreThan(30)))
                .containsOnly(e3,e7,e8,e10);

        assertThat(EmployeePredicates
                .filterEmployee(employees,EmployeePredicates.isAgeMoreThan(40).negate()))
                .containsOnly(e1,e2,e4,e5,e6,e9);

    }

    @Test
    public void test1() throws Exception {
        assertThat(EmployeePredicates.isAdultFemale().test(e1)).isFalse();
        assertThat(EmployeePredicates.isAgeMoreThan(20).test(e4)).isTrue();

    }
}
