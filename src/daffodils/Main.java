package daffodils;

import java.util.Scanner;
public class Main {
    static int N;
    public static void main (String[] args){
        scanN();
        find(N);
    }public static void scanN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个大于三的正整数:");
        N=scanner.nextInt();
    }public static void find(int N){
        for (int  i =xN(10,N-1);i<xN(10,N);i++){
            if (i==nN(i,N)) System.out.print(i+"\n");
        }
    }public static double  nN(int i, int N){
        int sub = 0;
        for(int j = N;j>0;j--){
            sub += xN(i%xN(10,j)/xN(10,j-1),N);
        }return sub;
    }public static int xN(int a, int b){    //
        int X = 1;
        for(int i = 1;i <=b;i++){
            X *= a;
        }return X;
    }
}
