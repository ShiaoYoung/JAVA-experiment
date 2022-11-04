import java.util.Scanner;

public class E32 {
    public  static void main(String[] args){

        //读入正整数n
        System.out.print("请输入一个小于10的数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = n;
        int n2 = 1;

        //n<10,打印边长为n的，用*组成的菱形轮廓
        if (n < 10 && n >1){

            //打印第1行的*
            for (int count1 = 1;count1 < n;count1++){
                System.out.print(" ");
            }
            System.out.println("*");

            //打印第2到第n行的*
            int count = 1;
            while (count < n){
                for (int count2 = 2;count2 < n1;count2++){
                    System.out.print(" ");
                }
                n1--;
                System.out.print("*");

                int i = 1;
                while (i <= n2){
                    System.out.print(" ");
                    System.out.print(" ");
                    i++;
                }
                n2 = n2 +1;
                System.out.println("*");
                count++;
            }

            //打印第n+1到倒数第1行的*
            count = 1;
            int x = 0;
            int i = n;
            int j = 3;
            while (count < n-1){
                for (int count2 = i; count2 <= n; count2++){
                    System.out.print(" ");
                }
                i--;
                System.out.print("*");

                j = j + x;
                while (j <= n){
                    System.out.print(" ");
                    System.out.print(" ");
                    j++;
                }
                System.out.println("*");
                j = 3;
                x++;
                count++;
            }

            //打印最后一行的*
            for (int count1 = 1;count1 < n;count1++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //n=1时，只需打印一个*
        if (n == 1){
            System.out.println("*");
        }
    }
}



//n = 3
//  *       2       n-1
// *  *     1   2   n-2
//*    *    0   4
// *  *     1   2
//  *       2


//例如n = 4时
//   *          n-1
//  *  *        n-2     2*1
// *    *       n-3     2*2
//*      *      n-4     2*3
// *    *       n-3
//  *  *        n-2
//   *          n-1

//n = 5
//    *
//   *  *
//  *    *
// *      *
//*        *
// *      *
//  *    *
//   *  *
//    *


