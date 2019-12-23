package employee;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {
    private List<Employee> employees;

    @Before
    public void beforeTest() {
        this.employees = Arrays.asList(new Employee("Max", 17), new Employee("Sepp", 18), new Employee("Nina", 15), new Employee("Mike", 51));
    }

    @Test
    public void should_return_all_employees_over_the_age_of_18_when_call_older_than_eighteen() {
        //Given

        //when
        EmployeeHandler employeeHandler = new EmployeeHandler();
        List<Employee> actualResult = employeeHandler.getOlderThanEighteen(this.employees);

        //Then
        for (Employee employee : actualResult) {
            assertTrue(employee.getAge() >= 18);
        }
    }

    @Test
    public void should_return_sorted_and_capitalized_employees_when_call_older_than_eighteen() {
        // Given

        // when
        EmployeeHandler employeeHandler = new EmployeeHandler();
        List<Employee> actualResult = employeeHandler.getOlderThanEighteen(this.employees);

        // Then
        assertEquals("SEPP", actualResult.get(0).getName());
        assertEquals("MIKE", actualResult.get(1).getName());
    }
}