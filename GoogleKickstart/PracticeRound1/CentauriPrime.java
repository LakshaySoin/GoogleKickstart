import java.util.*;

public class CentauriPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int test = 0; test < t; test++) {
            String k = scanner.next().toLowerCase();
            char val = k.charAt(k.length() - 1);
            String name = "nobody";
            for (int i = 0; i < vowels.length; i++) {
                if (vowels[i] == val) {
                    name = "Alice";
                }
            }
            if (name.equals("nobody") && val != 'y') {
                name = "Bob";
            }
            System.out.println("Case #" + (test + 1) + ": " + k + " is ruled by " + name + ".");
        }
    }
}
