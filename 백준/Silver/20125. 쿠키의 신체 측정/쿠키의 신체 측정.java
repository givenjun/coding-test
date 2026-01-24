import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] heart = new int[]{-1, -1};
        int leftArm = 0;
        int rightArm = 0;
        int waist = -2;
        int leftLeg = -1;
        int rightLeg = -1;

        String[][] a = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                a[i][j] = s[j];
                if (heart[0] == -1 && heart[1] == -1 && a[i][j].equals("*")) {
                    heart[0] = j;
                    heart[1] = i + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < heart[0] && a[heart[1]][i].equals("*")) leftArm++;
            else if (i > heart[0] && a[heart[1]][i].equals("*")) rightArm++;
        }

        for (int i = 0; i < n; i++) {
            if (a[i][heart[0]].equals("*")) waist++;
        }

        for (int i = 0; i < n; i++) {
            if (a[i][heart[0] - 1].equals("*")) leftLeg++;
            if (a[i][heart[0] + 1].equals("*")) rightLeg++;
        }

        bw.write((heart[1] + 1) + " " + (heart[0] + 1) + "\n");
        bw.write(leftArm + " " + rightArm + " " + waist + " " + leftLeg +  " " + rightLeg);
        bw.flush();
        bw.close();
    }
}
