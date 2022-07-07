import java.util.*;

public class SampleProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int tot = 0;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int c = scanner.nextInt();
                tot += c;
            }
            System.out.println("Case #" + (test + 1) + ": " + tot % m);
        }
    }
}