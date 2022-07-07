import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int tot = 0;
            for (int i = 0; i < n; i++) {
                int c = scanner.nextInt();
                tot += c;
            }
            int ans = tot % m;
            System.out.println("Case #" + (test+1) + ": " + ans);
        }
    }
}