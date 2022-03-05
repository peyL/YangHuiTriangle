package justscribble;


import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static int [][] arr(){
        System.out.print("请输入杨辉三角的边长:");
        int size = scanner.nextInt();
        int[][] c = new int[size][];
        return c;
    }
    public static void main(String[] args){
    int[][] arry = arr();
    for (int i = 0 ; i< arry.length;i++){
        arry[i]= new int[i+1];
        for (int k = 0; k< arry[i].length;k++){
            if(k==arry[i].length-1){
                arry[i][k]=1;
                System.out.println("\t"+1+"\n");
            }else if (k==0){
                arry[i][k]=1;
                System.out.print("\t"+arry[i][k]);
            }else{
                arry[i][k]=arry[i-1][k-1]+arry[i-1][k];
                System.out.print("\t"+arry[i][k]);
            }
        }
    }
    }
}