package org.example;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n ; i ++){
            for(int j= 0; j <= i ; j++){
                for(int k =0; k < n-1; k++){
                    bw.write(" ");
                }
                bw.write("*");
            }
            n--;
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
