package employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHandler {
    public List getOlderThanEighteen(List<Employee> employees) {
        return employees.stream().filter(employee -> employee.getAge() >= 18).collect(Collectors.toList());
    }
}
