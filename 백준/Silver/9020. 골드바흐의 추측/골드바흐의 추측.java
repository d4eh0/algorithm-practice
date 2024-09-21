import java.util.Scanner;

public class Main {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void gold(int A, int B) {
        if (isPrime(A)) {
            if (isPrime(B)) {
                System.out.println(A + " " + B);
            } else {
                A -= 1;
                B += 1;
                gold(A, B);
            }
        } else {
            A -= 1;
            B += 1;
            gold(A, B);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) { // n만큼 테스트 케이스 실행
            int T = sc.nextInt();
            int A = T/2;
            int B = T/2;
            gold(A,B);

        }
    }
}