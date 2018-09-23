package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _11_AlternatingCharactersTest {

    @Test
    public void alternatingCharacters() {
        _11_AlternatingCharacters alternatingCharacters = new _11_AlternatingCharacters();
        Assert.assertEquals(3, alternatingCharacters.alternatingCharacters("AAAAB"));
    }
}