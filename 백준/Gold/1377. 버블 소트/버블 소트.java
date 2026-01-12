import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        myData[] A = new myData[N];
        for (int i = 0; i < N; i++) {
            A[i] = new myData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(A);
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (max < A[i].index - i)
                max = A[i].index - i;
        }
        bw.write(max + 1 + "");
        bw.flush();
        bw.close();
    }
}

class myData implements Comparable<myData> {
    int value;
    int index;

    public myData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(myData o) {
        return this.value - o.value;
    }
}