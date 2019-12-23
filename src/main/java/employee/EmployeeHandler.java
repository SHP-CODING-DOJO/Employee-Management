package employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHandler {
    public List<Employee> getOlderThanEighteen(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getAge() >= 18)
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .peek(employee -> employee.setName(employee.getName().toUpperCase()))
                .collect(Collectors.toList());
    }
}
