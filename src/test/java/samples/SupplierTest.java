package samples;

import org.testng.annotations.Test;
import java8.supplier.Employee;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class SupplierTest {

    @Test
    public void test() throws Exception {
        Supplier<Employee> employeeSupplier =
                () -> {
            return new Employee(1,"Name1",20,"Eng");
        };

        assertThat(employeeSupplier.get().getAge()).isEqualTo(20);
    }

}
