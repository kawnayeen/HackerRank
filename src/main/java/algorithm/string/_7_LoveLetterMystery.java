package algorithm.string;

public class _7_LoveLetterMystery {
    int theLoveLetterMystery(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        if(s.equals(reversed))
            return 0;
        String firstPart;
        String secondPart;
        if(s.length()%2==0){
            firstPart = s.substring(0,s.length()/2);
            secondPart = s.substring(s.length()/2);
        }else{
            firstPart = s.substring(0, (s.length()/2));
            secondPart = s.substring((s.length()/2)+1);
        }
        secondPart = new StringBuilder(secondPart).reverse().toString();
        int minimumMove = 0;
        for(int i=0;i<firstPart.length();i++){
            minimumMove += Math.abs(firstPart.charAt(i)-secondPart.charAt(i));
        }
        return minimumMove;
    }
}
