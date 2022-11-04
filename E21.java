import java.util.Scanner;

public class E21 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个三位数：");

        int num = scanner.nextInt();

        System.out.println("十进制数" + num + "的八进制为" + Integer.toString(num,8));
    }
}
