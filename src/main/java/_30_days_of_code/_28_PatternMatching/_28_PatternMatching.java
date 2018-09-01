package _30_days_of_code._28_PatternMatching;

import java.util.List;
import java.util.stream.Collectors;

public class _28_PatternMatching {
    List<String> filteredName(List<Person> personList) {
        return personList.stream().filter(p -> p.email.endsWith("@gmail.com")).map(p -> p.name)
                .sorted().collect(Collectors.toList());
    }
}
