package algorithm.string;

public class _6_Pangrams {
    private static final String PANGRAM = "pangram";
    private static final String NOT_PANGRAM = "not pangram";
    private static final char a = 'a';

    String pangrams(String s) {
        s = s.toLowerCase();
        boolean[] attendanceSheet = new boolean[26];
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c))
                attendanceSheet[c-a] = true;
        }
        boolean isPangram = true;
        for(boolean bool:attendanceSheet){
            if(!bool){
                isPangram = false;
                break;
            }
        }
        if(isPangram)
            return PANGRAM;
        return NOT_PANGRAM;
    }
}
