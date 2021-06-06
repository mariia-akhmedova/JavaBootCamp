package activity2;

import activity1.Employee;
import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    private Employee employee;

    protected void setUp() throws Exception {
        super.setUp();
        employee = new Employee();
    }

    public void testSetAndGetCompany() {
        String testCompany = "company";
        employee.setCompany(testCompany);
        assertEquals(testCompany, employee.getCompany());
    }

    public void testSetAndGetTitle() {
        String testTitle = "title";
        employee.setTitle(testTitle);
        assertEquals(testTitle, employee.getTitle());
    }

    public void testSetAndGetSalary() {
        double testSalary = 10.0;
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());
    }

    public void testDefaultConstructor() {
        assertEquals(employee.getCompany(),"Unknown");
        assertEquals(employee.getTitle(),"Unknown");
        assertEquals(employee.getSalary(),0.0);
        assertEquals(employee.getName(),"Unknown");
        assertEquals(employee.getAge(),0);
    }

    public void testCustomConstructor() throws NameContainsNumbersException {
        Employee customEmployee = new Employee("Mary", 23, "Accenture", "QA Engineer", 2000.0);
        assertEquals(customEmployee.getName(), "Mary");
        assertEquals(customEmployee.getAge(), 23);
        assertEquals(customEmployee.getCompany(), "Accenture");
        assertEquals(customEmployee.getTitle(), "QA Engineer");
        assertEquals(customEmployee.getSalary(), 2000.0);


    }
}
