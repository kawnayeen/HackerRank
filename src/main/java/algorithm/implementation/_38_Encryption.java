package algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * kawnayeen
 * 14/9/18
 */
public class _38_Encryption {
    String encryption(String plainString) {
        plainString = plainString.trim().replace(" ", "");
        int column = (int) Math.ceil(Math.sqrt(plainString.length()));
        List<String> splitByRows = new ArrayList<>();
        while (plainString.length() > column) {
            splitByRows.add(plainString.substring(0, column));
            plainString = plainString.substring(column);
        }
        splitByRows.add(plainString);
        List<StringBuilder> stringBuilders = new ArrayList<>();
        for (int i = 0; i < column; i++)
            stringBuilders.add(new StringBuilder());
        for (String str : splitByRows) {
            for (int i = 0; i < str.length(); i++) {
                stringBuilders.get(i).append(str.charAt(i));
            }
        }
        StringBuilder output = new StringBuilder();
        for (StringBuilder builder : stringBuilders)
            output.append(builder.toString()).append(" ");
        return output.toString().trim();
    }
}
