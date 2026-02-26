import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> dq = new ArrayDeque<>();
        int[] prev = new int[n];
        int[] next = new int[n];
        boolean[] alive = new boolean[n];
        for (int i = 0; i < n; i++) {
            alive[i] = true;
        }
        
        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        next[n - 1] = -1;
        
        int pos = k;
        for (String c : cmd) {
            if (c.equals("C")) {
                if (prev[pos] != -1) next[prev[pos]] = next[pos];
                if (next[pos] != -1) prev[next[pos]] = prev[pos];
                alive[pos] = false;
                dq.addFirst(pos);
                if (next[pos] != -1) pos = next[pos];
                else pos = prev[pos];
            }
            else if (c.equals("Z")) {
                int idx = dq.pollFirst();
                alive[idx] = true;
                if (prev[idx] != -1) next[prev[idx]] = idx;
                if (next[idx] != -1) prev[next[idx]] = idx;
            }
            else {
                String[] cx = c.split(" ");
                int x = Integer.parseInt(cx[1]);
                
                if (cx[0].equals("U")) {
                    for (int i = 0; i < x; i++) {
                        pos = prev[pos];
                    }
                }
                else {
                    for (int i = 0; i < x; i++) {
                        pos = next[pos];
                    }
                }
            }
        }
        
        for (boolean a : alive) {
            if (a) sb.append("O");
            else sb.append("X");
        }
        
        String answer = new String(sb);
        return answer;
    }
}