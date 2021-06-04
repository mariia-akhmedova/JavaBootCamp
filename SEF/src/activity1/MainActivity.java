package activity1;

public class MainActivity {

    public static void main(String[] args) {


        Person person = new Person("Mary", 23);
        person.introduce();

        Employee employee = new Employee("Mary", 23, "Accenture", "QA Engineer");
        employee.introduce();
    }
}