import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        int num = 665;
        int result = 666;

        while (count < N) {
            String str = Integer.toString(num);
            if (str.contains("666")) {
                count++;
                result = num;
            }
            num++;
        }
        System.out.println(result);
    }
}
