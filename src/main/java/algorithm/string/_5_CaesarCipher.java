package algorithm.string;


public class _5_CaesarCipher {
    private static final char A = 'A';
    private static final char a = 'a';

    String caesarCipher(String s, int k) {
        k = k % 26;
        StringBuilder builder = new StringBuilder();
        for(char ch:s.toCharArray())
            builder.append(decodeChar(ch,k));
        return builder.toString().trim();
    }

    char decodeChar(char ch, int k){
        int delta;
        if(Character.isUpperCase(ch)){
            delta = (ch - A + k) % 26;
            return (char) (A + delta);
        }
        if(Character.isLowerCase(ch)){
            delta = (ch - a + k) % 26;
            return (char) (a + delta);
        }
        return ch;
    }
}
