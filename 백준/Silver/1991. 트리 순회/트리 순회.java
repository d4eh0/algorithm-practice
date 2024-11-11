import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    static Node[] arr;
    static BufferedReader bf;
    static StringTokenizer st;

    public static class Node {
        String current;
        Node left;
        Node right;
        Node(String current) {
            this.current = current;
            left = null;
            right = null;
        }
        public void addLeft(Node node) {
            left = node;
        }

        public void addRight(Node node) {
            right = node;
        }
    }

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        arr = new Node[26];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine());
            String current = st.nextToken();
            int currentIndex = current.charAt(0) - 'A';
            if(arr[currentIndex] == null) {
                arr[currentIndex] = new Node(current);
            }

            String left = st.nextToken();
            if (!left.equals(".")) {
                int leftIndex = left.charAt(0) - 'A';
                arr[leftIndex] = new Node(left);
                arr[currentIndex].addLeft(arr[leftIndex]);
            }

            String right = st.nextToken();
            if (!right.equals(".")) {
                int rightIndex = right.charAt(0) - 'A';
                arr[rightIndex] = new Node(right);
                arr[currentIndex].addRight(arr[rightIndex]);
            }

        }

        preOrder(arr[0]);
        System.out.println();
        inOrder(arr[0]);
        System.out.println();
        postOrder(arr[0]);

    }

    public static void preOrder(Node x) {
        if(x == null) return;
        System.out.print(x.current);
        preOrder(x.left);
        preOrder(x.right);
    }
    public static void inOrder(Node x) {
        if(x == null) return;
        inOrder(x.left);
        System.out.print(x.current);
        inOrder(x.right);
    }
    public static void postOrder(Node x) {
        if(x == null) return;
        postOrder(x.left);
        postOrder(x.right);
        System.out.print(x.current);

    }
}