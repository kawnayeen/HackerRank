package algorithm.string;

public class _12_BeautifulBinary {
    private static final String UGLY = "010";
    private static final String SPACE = "A";
    private static final char A = 'A';

    int beautifulBinaryString(String b) {
        b = b.replace(UGLY, SPACE);
        int count = 0;
        for (char ch : b.toCharArray())
            if (ch == A)
                count++;
        return count;
    }
}
