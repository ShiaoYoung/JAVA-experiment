import java.util.Scanner;

public class E22 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入系数：");

        System.out.print("a = ");
        double a = scanner.nextDouble();


        System.out.print("b = ");
        double b = scanner.nextDouble();


        System.out.print("c = ");
        double c = scanner.nextDouble();

        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;

        if (x1 != x2)
            System.out.println("方程的两个根为：" + x1 + " , " + x2);

        else
            System.out.println("方程两个相等的根为：" + x1);
    }
}
