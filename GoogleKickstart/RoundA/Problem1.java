import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ans = 0;
            for (int i = a; i <= b; i++) {
                String temp = String.valueOf(i);
                long prod = 1;
                long sum = 0;
                for (int j = 0; j < temp.length(); j++) {
                    prod *= (temp.charAt(j) - 48);
                    sum += (temp.charAt(j) - 48);
                }
                if (prod % sum == 0) {
                    ans++;
                }
            }
            System.out.println("Case #" + (test + 1) + ": " + ans);
        }
    }
}
