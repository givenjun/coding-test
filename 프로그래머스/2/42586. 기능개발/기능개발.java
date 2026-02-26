import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        int days = 0;
        int len = progresses.length;
        int[] answer = new int[len];
        int[] release = new int[len];
        
        for (int i = 0; i < len; i++) {
            release[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
        }
        
        for (int i : release) {
            dq.addLast(i);
        }
        
        int idx = 0;
        System.out.println(dq);
        
        while (!dq.isEmpty()) {
            int chk = dq.peekFirst();
            int cnt = 0;
            while (!dq.isEmpty()) {
                System.out.println(idx + ": " + dq);
                if (chk >= dq.peekFirst()) {
                    // System.out.println(chk + " <= " + dq.peekFirst());
                    dq.pollFirst();
                    cnt++;
                }
                else {
                    break;
                }
            }
            answer[idx] = cnt;
            idx++;
        }
        
        int[] res = new int[idx];
        for (int i = 0; i < idx; i++) {
            res[i] = answer[i];
        }
        return res;
    }
}