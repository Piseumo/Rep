package org.example;


import java.util.Scanner;
import java.io.*;

public class aa {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i ++){
            if(Integer.parseInt(input[i]) < x){
                bw.write(input[i]+" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}