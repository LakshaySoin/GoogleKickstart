import java.util.*;

public class BuildingPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            String blocks = scanner.next();
            int ans = 0;
            int[][] prefix = new int[blocks.length() + 1][26];
            int[] prev = new int[26];
            for (int i = 1; i <= n; i++) {
                prev[blocks.charAt(i - 1) - 65]++;
                int[] temp = prev.clone();
                prefix[i] = temp;
            }
            for (int i = 0; i < q; i++) {
                int l = scanner.nextInt() - 1;
                int r = scanner.nextInt() - 1;
                String temp = blocks.substring(l, r + 1);
                if (temp.length() == 1) {
                    ans++;
                } else {
                    int[] cnt = new int[26];
                    for (int j = 0; j < 26; j++) {
                        cnt[j] = prefix[r + 1][j] - prefix[l][j];
                    }
                    int num = 0;
                    for (int j = 0; j < 26; j++) {
                        if (cnt[j] % 2 == 1) {
                            num++;
                        }
                    }
                    if (temp.length() % 2 == 0 && num == 0) {
                        ans++;
                    } else if (temp.length() % 2 == 1 && num == 1) {
                        ans++;
                    }
                }
            }
            System.out.println("Case #" + (test + 1) + ": " + ans);
        }
    }
}
