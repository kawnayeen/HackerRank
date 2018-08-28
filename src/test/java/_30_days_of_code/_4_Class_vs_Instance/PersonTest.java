package _30_days_of_code._4_Class_vs_Instance;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest extends ConsoleOutputTest {
    private static final String NEW_LINE = "\n";

    @Test
    public void testInvalidAge() {
        Person person = new Person(-6);
        Assert.assertEquals(Person.INVALID_AGE + NEW_LINE, outContent.toString());
    }

    @Test
    public void testYoungAge() {
        Person person = new Person(6);
        person.amIOld();
        Assert.assertEquals(Person.YOUNG_AGE + NEW_LINE, outContent.toString());
    }

    @Test
    public void testTeenAge() {
        Person person = new Person(14);
        person.amIOld();
        Assert.assertEquals(Person.TEENAGE + NEW_LINE, outContent.toString());
    }

    @Test
    public void testOldAge() {
        Person person = new Person(21);
        person.amIOld();
        Assert.assertEquals(Person.OLD_AGE + NEW_LINE, outContent.toString());
    }

    @Test
    public void testYearPasses() {
        Person person = new Person(17);
        person.amIOld();
        person.yearPasses();
        person.amIOld();
        Assert.assertEquals(Person.TEENAGE + NEW_LINE + Person.OLD_AGE + NEW_LINE, outContent.toString());
    }
}