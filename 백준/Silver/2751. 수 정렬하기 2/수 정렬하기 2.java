import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> List = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            List.add(Integer.parseInt(bf.readLine()));
        }

        List.sort(null);

        for(int i = 0; i < n; i++) {
            bw.write(List.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
