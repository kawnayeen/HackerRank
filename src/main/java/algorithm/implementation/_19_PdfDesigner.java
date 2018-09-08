package algorithm.implementation;

public class _19_PdfDesigner {
    int designerPdfViewer(int[] h, String word) {
        int maximumHeight = -1;
        for (char c : word.toCharArray()) {
            if (h[c - 97] > maximumHeight) {
                maximumHeight = h[c - 97];
            }
        }
        return maximumHeight * word.length();
    }
}
