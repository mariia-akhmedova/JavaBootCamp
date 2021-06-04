package activity1;

public class Employee extends Person {
    private String company;
    private String title;
    private double salary;

    public Employee(String name, int age, String company, String title, double salary) {
        this.setName(name);
        this.setAge(age);
        this.company = company;
        this.title = title;
        this.salary = salary;
    }

    public Employee() {
        this.setName("Unknown");
        this.setAge(0);
        this.company = ("Unknown");
        this.title = ("Unknown");
        this.salary = (0);
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("My Name is " + this.getName() + " and i am " + this.getAge() + " years old. I work as " + title + " in " + company);
    }
}
