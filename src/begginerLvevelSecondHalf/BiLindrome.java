package begginerLvevelSecondHalf;

public class BiLindrome {
    public static void main(String[] args) {
        String ed = "Elmar";
        String mar = "mar";
        System.out.println(solve(ed, mar));
    }

    static int solve(String hatStack, String needle) {
        int n = hatStack.length();
        int m = needle.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (hatStack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j == m) {
                    return i - m + 1;  // Correct index calculation
                }
            } else {
                i--;  // Reset i to the mismatch position
                j = 0;
            }
        }
        return -1;
    }
}
