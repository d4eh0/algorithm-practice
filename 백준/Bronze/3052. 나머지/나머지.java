import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int num, remainder;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            remainder = num % 42;
            if (!set.contains(remainder)) {
                set.add(remainder);
                count++;
            }
        }
        System.out.println(count);
    }
}
