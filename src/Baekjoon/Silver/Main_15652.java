package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15652 {
    static int N,M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M+1];
        visit = new boolean[N+1];

        dfs(1,1);
        System.out.println(sb);
    }
    public static void dfs(int x, int y){
        if(x == M+1){
            for(int i = 1; i<= M; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = y ; i <= N; i++){
            arr[x] = i;
            dfs(x+1,i);

        }


    }
}
