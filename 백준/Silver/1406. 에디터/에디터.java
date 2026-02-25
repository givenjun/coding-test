import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            left.addLast(str.charAt(i));
        }
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            
            if (com.equals("L")) {
                if (left.size() == 0) continue;
                right.addFirst(left.pollLast());
            }
            else if (com.equals("D")) {
                if (right.size() == 0) continue;
                left.addLast(right.pollFirst());
            }
            else if (com.equals("B")) {
                if (left.size() == 0) continue;
                left.pollLast();
            }
            else if (com.equals("P")) {
                char val = st.nextToken().charAt(0);
                left.addLast(val);
            }
        }

        int leftLen = left.size(), rightLen = right.size();
        for (int i = 0; i < leftLen; i++) {
            bw.write(left.pollFirst());
        }
        for (int i = 0; i < rightLen; i++) {
            bw.write(right.pollFirst());
        }
        bw.flush();
        bw.close();
    }
}