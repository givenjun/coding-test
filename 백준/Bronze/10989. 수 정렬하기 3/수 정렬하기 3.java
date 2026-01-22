import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];

        for (int i = 0; i < num; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        for (int i = 0; i < num; i++) {
            bw.write(list[i] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
