package java8.supplier;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private long empId;
    private String name;
    private int age;
    private String designation;

    public Employee(long empId, String name, int age, String designation) {
        super();
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
}
