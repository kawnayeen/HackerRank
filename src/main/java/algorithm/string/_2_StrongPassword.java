package algorithm.string;

/**
 * kawnayeen
 * 17/9/18
 */
public class _2_StrongPassword {
    private static final String numbers = "0123456789";
    private static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
    private static final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String special_characters = "!@#$%^&*()-+";

    public int minimumNumber(int i, String s) {
        boolean numberFound = false;
        boolean upperCaseFound = false;
        boolean lowerCaseFound = false;
        boolean specialCharFound = false;
        boolean lengthOkay = i >= 6;
        int minimumAddition = 4;
        for (char c : s.toCharArray()) {
            if (!numberFound && numbers.contains(String.valueOf(c))) {
                numberFound = true;
                minimumAddition = minimumAddition - 1;
            } else if (!upperCaseFound && upper_case.contains(String.valueOf(c))) {
                upperCaseFound = true;
                minimumAddition = minimumAddition - 1;
            } else if (!lowerCaseFound && lower_case.contains(String.valueOf(c))) {
                lowerCaseFound = true;
                minimumAddition = minimumAddition - 1;
            } else if (!specialCharFound && special_characters.contains(String.valueOf(c))) {
                specialCharFound = true;
                minimumAddition = minimumAddition - 1;
            }
        }
        if (lengthOkay)
            return minimumAddition;
        return (6 - i) > minimumAddition ? (6 - i) : minimumAddition;
    }
}
