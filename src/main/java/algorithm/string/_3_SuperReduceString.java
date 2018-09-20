package algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class _3_SuperReduceString {

    String superReducedString(String s) {
        List<Character> charList = new ArrayList<>();
        for(char ch:s.toCharArray())
            charList.add(ch);
        boolean broken = false;
        do{
            broken = false;
            for(int i=0;i<charList.size()-1;i++){
                if(charList.get(i)==charList.get(i+1)){
                    charList.remove(i+1);
                    charList.remove(i);
                    broken = true;
                    break;
                }
            }
        }while (broken);
        StringBuilder builder = new StringBuilder();
        for(Character ch:charList)
            builder.append(ch);
        String output = builder.toString().trim();
        if(output.isEmpty())
            return "Empty String";
        return output;
    }
}
