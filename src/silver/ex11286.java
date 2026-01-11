package silver;

import java.io.*;
import java.util.PriorityQueue;

public class ex11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs) return o1 > o2 ? 1 : -1;
            else return first_abs - second_abs;
        });
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (q.isEmpty()) bw.write("0\n");
                else bw.write(q.poll() + "\n");
            }
            else {
                q.add(num);
            }
        }
        bw.flush();
        bw.close();
    }
}
