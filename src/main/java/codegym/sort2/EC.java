package codegym.sort2;

import java.util.function.Consumer;

public class EC implements Consumer<Employee> {
    @Override
    public void accept(Employee employee) {
        System.out.println(employee.fullName());
    }
}
