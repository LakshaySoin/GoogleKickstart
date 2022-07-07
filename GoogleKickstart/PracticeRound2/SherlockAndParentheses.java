import java.util.*;

public class SherlockAndParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int a = Math.min(l, r);
            int ans = 0;
            for (int i = 1; i <= a; i++) {
                ans += i;
            }
            System.out.println("Case #" + (test + 1) + ": " + ans);
        }
    }
}

// ()() 2+1 = 3
// ()()() 3+2+1= 6
// ()()()() 4+3+2+1 = 10
// ()()()()() 5+4+3+2+1 = 15
