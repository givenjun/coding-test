import java.io.*;   
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NL = br.readLine().split(" ");
        int N = Integer.parseInt(NL[0]);
        int L = Integer.parseInt(NL[1]);

        String[] S = br.readLine().split(" ");
        ArrayDeque<Node> chk = new ArrayDeque<>();
        ArrayDeque<Integer> ans = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(S[i]);
            
            while(!chk.isEmpty() && chk.getLast().value > s) {
                chk.removeLast();
            }
            chk.addLast(new Node(i, s));
            
            if ( i - (chk.getFirst().index) >= L) {
                chk.removeFirst();
            }

            bw.write(chk.getFirst().value + " ");
        }


        bw.flush();
        bw.close();
    }

    static class Node {
        public int index;
        public int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
