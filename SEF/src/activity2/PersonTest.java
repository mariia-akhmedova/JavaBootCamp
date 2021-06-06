package activity2;

import activity1.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person person;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    public void testSetAndGetName() throws NameContainsNumbersException {
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
        String name = "name";
        Person customPerson = new Person(name, 23);
        assertEquals(customPerson.getName(), name);
        assertEquals(customPerson.getAge(), 23);
    }

    public void testNumbersInNameThrowException() {
        try {
            person.setName("Mary5");
            fail();
        } catch (NameContainsNumbersException e) {

        }
    }
}
