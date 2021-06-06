package activity1;

public class Students extends Person {
    private String schoolName;

    public Students(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {
        System.out.println("I study in university " + schoolName);
    }
}