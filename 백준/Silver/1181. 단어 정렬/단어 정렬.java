import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String str = bf.readLine();
            hs.add(str);
        }

        ArrayList<String> al = new ArrayList<>(hs);
        al.sort((a, b) -> {
            if (a.length() == b.length())
                return a.compareTo(b);
            return a.length() - b.length();
        });
        for (String st : al)
            bw.write(st + "\n");
        bw.flush();
    }
}