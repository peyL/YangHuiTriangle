import java.util.Scanner;

public class ArrayAdd {
    static double []  che = new double[] {3,5,1,3.4,2,50};
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        double [] array1= {1,2,3};
       for (char c ='c';c=='c';) {
           double [] array2= new double[array1.length+1];
           for (int i = 0; i < array1.length; i++) {
               array2[i] = array1[i];
           }array2[array1.length]=array1.length+1;
           array1=array2;
           for (double q:
                array1) {
               System.out.print("\t"+q);
           }System.out.println("\n按任意键退出程序\n如果继续扩容请输入c");
           c = scanner.next().charAt(0);//将Y的第一个字符赋值给c
    }  }
}
