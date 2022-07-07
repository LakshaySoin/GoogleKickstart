import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            String num = scanner.next();
            String ans = "";
            long sum = 0;
            for (int x = 0; x < num.length(); x++) {
                sum += (num.charAt(x) - 48);
            }
            long i = 0;
            if (sum % 9 == 0) {
                i = 0;
            } else {
                i = 9 - (sum % 9);
            }
            if (i == 0) {
                ans = num.substring(0, 1) + i + num.substring(1, num.length());
            } else {
                boolean good = false;
                for (int j = 0; j < num.length(); j++) {
                    if (i < (num.charAt(j) - 48)) {
                        ans = num.substring(0, j) + i + num.substring(j, num.length());
                        good = true;
                        break;
                    }
                }
                if (!good) {
                    ans = num + i;
                }
            }
            System.out.println("Case #" + (test + 1) + ": " + ans);
        }
    }
}
