import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> a = new ArrayList<String>();

        for (int i = 0; i < N; i++)
            a.add(br.readLine());

        // split은 문자열을 구분자로 나누어 배열을 리턴
        a.sort((s1, s2) -> {
            int ageA = Integer.parseInt(s1.split(" ")[0]);
            int ageB = Integer.parseInt(s2.split(" ")[0]);
            return ageA - ageB;
        });

        for (String str : a)
            bw.write(str + "\n");

        bw.flush();
    }
}
