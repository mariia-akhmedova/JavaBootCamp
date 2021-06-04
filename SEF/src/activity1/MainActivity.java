package activity1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity {

    public static void main(String[] args) {


        Person person = new Person("Mary", 23);
        person.introduce();

        Employee employee = new Employee("Mary", 23, "Accenture", "QA Engineer", 2000);
        employee.introduce();

        Students student = new Students("Transport and Telecommunication Institute");
        student.introduce();

        Employee employee1 = new Employee("Bob", 28, "Accenture", "Java Developer", 3500);
        Employee employee2 = new Employee("Rachel", 25, "Accenture", "HR manager", 1700);
        Employee employee3 = new Employee("Monica", 32, "Accenture", "Accountant", 1500);

        List<Employee> employeeList = new ArrayList();

        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        print(employeeList);


    }
    static void print(List<Employee> list) {

        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            System.out.println("name: " + employee.getName());
        }


    }

}