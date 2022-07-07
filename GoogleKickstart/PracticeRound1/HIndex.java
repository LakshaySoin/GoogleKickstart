import java.util.*;

public class HIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int[] prefix = new int[(int) 10e5 + 1];
            int ans = 0;
            System.out.print("Case #" + (test + 1) + ":");
            for (int i = 1; i <= n; i++) {
                int c = scanner.nextInt();
                for (int x = 1; x <= c; x++) {
                    prefix[x]++;
                }
                for (int j = 1; j < prefix.length; j++) {
                    if (prefix[j] >= j) {
                        ans = Math.max(ans, j);
                    }
                }
                System.out.print(" " + ans);
            }
            System.out.println();
        }
    }
}