package _30_days_of_code._28_PatternMatching;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _28_PatternMatchingTest {
    @Test
    public void testEmailMatching() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("riya", "riya@gmail.com"));
        personList.add(new Person("julia", "julia@julia.me"));
        personList.add(new Person("julia", "sjulia@gmail.com"));
        personList.add(new Person("julia", "julia@gmail.com"));
        personList.add(new Person("samantha", "samantha@gmail.com"));
        personList.add(new Person("tanya", "tanya@gmail.com"));
        _28_PatternMatching patternMatching = new _28_PatternMatching();
        List<String> filteredNames = patternMatching.filteredName(personList);
        Assert.assertEquals(5, filteredNames.size());
        Assert.assertEquals("julia", filteredNames.get(0));
        Assert.assertEquals("tanya", filteredNames.get(4));
    }
}