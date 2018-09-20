package algorithm.string;

public class _4_MarsExploration {
    int marsExploration(String s) {
        int numberOfSOS = s.length()/3;
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<numberOfSOS;i++)
            builder.append("SOS");
        String actualString = builder.toString().trim();
        char[] actual = actualString.toCharArray();
        char[] received = s.toCharArray();
        int letterChangedCount = 0;
        for(int i=0;i<actual.length;i++){
            if(actual[i]!=received[i])
                letterChangedCount++;
        }
        return letterChangedCount;
    }
}
