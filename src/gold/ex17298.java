package gold;

import java.io.*;
import java.util.Stack;

public class ex17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] ans = new int[N];
        String[] S = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(S[i]);
        }

        Stack<Integer> stack = new Stack<>();
        // stack.push(0);

        for (int i = 0; i < N; i++) {
            while(!stack.isEmpty() && (A[i] > A[stack.peek()])) {
                int idx = stack.pop();  
                ans[idx] = A[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int idx = stack.pop();
            ans[idx] = -1;
        } 

        for (int a : ans) {
            bw.write(a + " ");
        }
        bw.flush();
        bw.close();
    }
}
