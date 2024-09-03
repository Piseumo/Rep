package org.example;
import java.io.*;

public class Ex07 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = br.readLine().toCharArray();
        int[] alpa = new int[26];
        int num = 0;
        for(int i = 0; i < 26 ;i ++){
            alpa[i] = i;
        }
        // input[] = {b,a,e,k,j,o,o,n}
        for(int i = 0; i < input.length; i++){
            num = ((int)input[i])-97;
            for(int j = 0; j < 26; j++){
                if(num == alpa[j]){
                    bw.write(alpa[j]+" ");
                }
                else if(num != alpa[j]){
                    //bw.write(""+(-1));
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

