import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static boolean isPrime(int n) {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2 == 0) return false;
        for(int i=3;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 소수들 저장
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=2;i<=n;i++) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }
        // 알고리즘

        int count = 0;
        int start_index = primes.size()-1;
        int end_index = primes.size()-1;
        int sum = 0;

        while(start_index >= 0) {
            sum += primes.get(start_index--);

            if( sum == n ) {
                count++;
                sum = 0;
                end_index--;
                start_index = end_index;
            } else if ( sum > n ) {
                sum = 0;
                end_index--;
                start_index = end_index;
            }
        }
        System.out.println(count);
    }
}
