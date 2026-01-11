package silver;

import java.io.*;
import java.util.Stack;

public class Ex1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            ans[i] = Integer.parseInt(br.readLine());    
        }

        int num = 1;
        boolean res = true;
        for (int i = 0; i < N; i++) {
            if (ans[i] >= num) {
                while (ans[i] >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int a = stack.pop();
                if (a > ans[i]) {
                    System.out.print("NO\n");
                    res = false;
                    break;
                }
                else sb.append("-\n");
            }
        }

        if (res) {
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }
    }
}
