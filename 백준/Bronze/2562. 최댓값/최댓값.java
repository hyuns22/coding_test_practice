import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int[] arr = new int[9];

        for(int i=0;i<9   ;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int ind = 1;
        for(int i=0;i<9;i++){
            if(arr[i]>max) {
                max = arr[i];
                ind = i+1;
            }

        }

        bw.write(max+""+"\n");
        bw.write(ind+"");
        bw.close();
    }

}


