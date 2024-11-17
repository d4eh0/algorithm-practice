import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int[] arr = new int[26];
            boolean isFail = true;

            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            String output = st.nextToken();

            // 1. 문자열 길이 확인
            if (input.length() != output.length()) {
                sb.append("Impossible\n");
                continue;
            }

            // 2. 문자 빈도 계산
            for (char c : input.toCharArray()) arr[c - 'a']++;
            for (char c : output.toCharArray()) {
                if (arr[c - 'a'] > 0) arr[c - 'a']--;
                else {
                    isFail = false;
                    break;
                }
            }

            if (isFail) {
                sb.append("Possible\n");
            } else {
                sb.append("Impossible\n");
            }
        }
        System.out.println(sb);
    }
}
