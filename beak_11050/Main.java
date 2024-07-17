/*이항 계수 1 자연수 N과 정수 K가 주어졌을 때 이항 계수를 구하는 프로그램을 작성하시오*/
package beak_11050;

import java.util.Scanner;

public class Main {
    public static int [][] cache;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int result = bino_coef(N, K);
        System.out.println(result);

        in.close();
    }

    public static int bino_coef(int n, int r){
        cache = new int[n+1][r+1];

        for(int i = 0; i<n+1; i++){
            cache[i][0] = 1;
        }
        for(int i = 0; i<r+1; i++){
            cache[i][i] = 1;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < r+1; j++){
                cache[i][j] = cache[i-1][j] + cache[i-1][j-1];
            }
        }

        return cache[n][r];
    }
}