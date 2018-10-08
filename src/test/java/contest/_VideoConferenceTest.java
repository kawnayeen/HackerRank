package contest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class _VideoConferenceTest {

    @Test
    public void solve() {
        _VideoConference videoConference = new _VideoConference();
        List<String> input = Arrays.asList(
                "mary",
                "stacy",
                "sam",
                "samuel",
                "sam",
                "miguel");
        System.out.println(videoConference.solve(input));

        List<String> secondInput = Arrays.asList(
                "alvin",
                "alice",
                "alvin"
        );

        System.out.println(videoConference.solve(secondInput));
    }
}