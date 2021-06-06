package activity2;

import activity1.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person person;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    public void testSetAndGetName() {
        String testName = "name";
        person.setName(testName);
        assertEquals(testName, person.getName());

    }

    public void testSetAndGetAge() {
        int testAge = 10;
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }
    public void testDefaultConstructor() {
        assertEquals(person.getName(), "Unknown");
        assertEquals(person.getAge(), 0);

    }
    public void testCustomConstructor() {
        Person customPerson = new Person("Mary", 23);
        assertEquals(customPerson.getName(), "Mary");
        assertEquals(customPerson.getAge(), 23);


    }
}
