package samples;

import org.testng.annotations.Test;
import sample.optional.Company;
import sample.optional.Department;
import sample.optional.Manager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class Optional2Test {

    @Test
    public void test() throws Exception {
        Manager manager = new Manager("Mr. M");
        Department department = new Department();
        department.setBoss(manager);
        System.out.println(department.getBoss());

        Department department1 = new Department();
        System.out.println(department1.getBoss());

    }

    @Test
    public void flatMapTest() throws Exception {

        Department department = new Department();
        department.setBoss(new Manager("Mr m1"));
        Company company = new Company();
        Optional<Company> comp = Optional.of(company);

        company.setDepartment(department);

        System.out.println(company.getDepartment());
        assertThat(comp
                .flatMap(Company::getDepartment)
                .flatMap(Department::getBoss)
                .map(Manager::getName))
                .get()
                .hasToString("Mr m1");

        assertThat(company.getDepartment()
                .flatMap(Department::getBoss)
                .map(Manager::getName))
                .get()
                .hasToString("Mr m1");
    }

}
