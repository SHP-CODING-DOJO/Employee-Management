package employee;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        List actualResult = employeeHandler.getOlderThanEighteen(this.employees);

        //Then
        List expectResult = Arrays.asList(this.employees.get(1), this.employees.get(3));
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void should_return_sorted_employees_when_call_get_sorted_employees() {
        // Given

        // when
        EmployeeHandler employeeHandler = new EmployeeHandler();
        List<Employee> actualResult = employeeHandler.getSortedEmployees(this.employees);

        // Then
        assertEquals("Max", actualResult.get(0).getName());
        assertEquals("Mike", actualResult.get(1).getName());
        assertEquals("Nina", actualResult.get(2).getName());
        assertEquals("Sepp", actualResult.get(3).getName());
    }
}