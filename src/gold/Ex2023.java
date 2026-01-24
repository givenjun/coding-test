package gold;

import java.io.*;

public class Ex2023 {
    static int n;
    static StringBuilder sb = new StringBuilder(); 
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

        System.out.println(sb);
        br.close();
    }
    public static void DFS(int num, int digits) {
        if (digits == n) {
            if (primeCheck(num)) 
                sb.append(num).append("\n");
            return;
        }
        for (int i = 1; i < 10; i += 2) {
            if (primeCheck(num))
                DFS(num * 10 + i, digits + 1);
        }
    }
    public static boolean primeCheck(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
