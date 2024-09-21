import java.util.Scanner;

public class Main {
    static int N;
    static boolean isPrime(int num) {
        if (num <= 1) return false; // 1 이하의 숫자는 소수가 아님
        if (num == 2) return true;  // 2는 소수임
        if (num % 2 == 0) return false; // 짝수는 소수가 아님 (2를 제외하고)

        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if(num % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 어떤 수로도 나누어떨어지지 않으면 소수임
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        StringBuilder sb = new StringBuilder();
        N = sc.nextInt(); // N입력
        int[] firstPrimes = {2, 3, 5, 7};

        for (int prime : firstPrimes) {
            makePrime(prime, 1); // 첫 숫자는 1자리부터 시작
        }
    }

    static void makePrime(int num, int length) {
        if (length == N) {
            if (isPrime(num)) {
                System.out.println(num); // N자리 신기한 소수 출력
            }
            return;
        }
        for (int i = 1; i <= 9; i++) {
            int newNum = num * 10 + i; // 기존 숫자의 자리에 새로운 숫자 추가
            if (isPrime(newNum)) {
                makePrime(newNum, length + 1); // 자릿수 증가시키면서 재귀 호출
            }
        }
    }

}// 0이 들어가는순간 소수가 아니게 되더라.
// 소수판별코드
// 재귀구현하는게힘듬

