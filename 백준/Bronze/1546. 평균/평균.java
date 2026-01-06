import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int max = 0;
        
        for (String s : str) {
            int n = Integer.parseInt(s);
            if (n > max) {
                max = n;
                if (max == 100)
                    break;
            }
        }
        
        double sum = 0;
        for (String s : str) {
            sum += ((Double.parseDouble(s)) / max * 100);
        }
        double avg = sum / N;
        
        bw.write(avg + "");
        bw.flush();
        bw.close();
    }
}