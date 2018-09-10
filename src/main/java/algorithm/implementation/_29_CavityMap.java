package algorithm.implementation;

/**
 * kawnayeen
 * 10/9/18
 */
public class _29_CavityMap {
    public String[] cavityMap(String[] grid) {
        boolean hasSpace = false;
        if (grid[0].contains(" ")) {
            hasSpace = true;
            for (int i = 0; i < grid.length; i++) {
                grid[i] = grid[i].replace(" ", "").trim();
            }
        }
        int squareSide = grid[0].length();
        if (squareSide < 3) {
            if (hasSpace) {
                for (int i = 0; i < grid.length; i++) {
                    String str = grid[i];
                    StringBuilder stringBuilder = new StringBuilder();
                    for(char ch:str.toCharArray()){
                        stringBuilder.append(ch);
                        stringBuilder.append(" ");
                    }
                    grid[i] = stringBuilder.toString().trim();
                }
            }
            return grid;
        }

        int[][] intGrid = new int[squareSide][squareSide];
        for (int i = 0; i < squareSide; i++) {
            for (int j = 0; j < squareSide; j++) {
                intGrid[i][j] = Integer.parseInt(grid[i].charAt(j) + "");
            }
        }

        for (int i = 1; i < squareSide - 1; i++) {
            for (int j = 1; j < squareSide - 1; j++) {
                int valueToConsider = intGrid[i][j];
                if (valueToConsider > intGrid[i - 1][j]
                        && valueToConsider > intGrid[i + 1][j]
                        && valueToConsider > intGrid[i][j - 1]
                        && valueToConsider > intGrid[i][j + 1]) {
                    intGrid[i][j] = 99;
                }
            }
        }

        String[] output = new String[squareSide];
        for (int i = 0; i < squareSide; i++) {
            String str = "";
            for (int j = 0; j < squareSide; j++) {
                if (intGrid[i][j] == 99) {
                    str += "X";
                } else
                    str += intGrid[i][j];
                if (hasSpace)
                    str += " ";
            }
            output[i] = str.trim();
        }
        return output;
    }
}
