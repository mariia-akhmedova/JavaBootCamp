package activity2;

import activity1.Employee;
import activity1.Students;
import junit.framework.TestCase;

public class StudentsTest extends TestCase {
    private Students students;
    String schoolName = "Transport and Telecommunication Institute";

    protected void setUp() throws Exception {
        super.setUp();
        students = new Students(schoolName);
    }

    public void testSetAndGetSchoolName() {
        String testSchoolName = "schoolName";
        students.setSchoolName(testSchoolName);
        assertEquals(testSchoolName, students.getSchoolName());
    }

    public void testCustomConstructor() {
        assertEquals(schoolName, students.getSchoolName());
    }

}
