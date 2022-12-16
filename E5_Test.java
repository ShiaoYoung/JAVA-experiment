import java.util.Random;
import java.util.Scanner;

public class E5_Test {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //ACC1
        System.out.print("请输入用户名：");
        String ac1 = scanner.next();
        System.out.print("请输入账号：");
        int nu1 = scanner.nextInt();
        System.out.print("请输入余额：");
        double ba1 = scanner.nextDouble();

        E5_BankACC ACC1 = new E5_BankACC(ac1,nu1,ba1);
        System.out.println();

        ACC1.withdraw(random.nextDouble(0,500));
        ACC1.deposit(random.nextDouble(0,500));

        System.out.println(ACC1);

        System.out.println();

        //ACC2
        System.out.print("请输入用户名：");
        String ac2 = scanner.next();
        System.out.print("请输入账号：");
        int nu2 = scanner.nextInt();
        System.out.print("请输入余额：");
        double ba2 = scanner.nextDouble();
        E5_BankACC ACC2 = new E5_BankACC(ac2, nu2,ba2);

        ACC2.withdraw(random.nextDouble(0,500));
        ACC2.deposit(random.nextDouble(0,500));

        System.out.println(ACC2);
    }
}
