import java.util.Scanner;

public class E7_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("想要获得几个月的日历？（1/2）");
        int x = scanner.nextInt();
        System.out.print("请输入一个月份：");
        int m = scanner.nextInt();

        if (x == 2){
            if (m + 1 < 13){
                System.out.println(m + "月和" + (m + 1) + "月的日历为：");
                System.out.print(" " + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六" + "\t" +
                                "日" + "\t");
                System.out.println("\t" + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六" +
                                    "\t" + "日");
                CalPrint.getCal2(m);

            } else if (m + 1 == 13) {
                System.out.println(m + "月的日历为：");
                System.out.println(" " + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六" +
                                    "\t" + "日" + "\t");
                CalPrint.getCal2(m);
            }
        } else if (x == 1) {
            System.out.println(m + "月的日历为：");
            System.out.println(" " + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六" + "\t" +
                                "日" + "\t");
            CalPrint.getCal1(m);
        }
    }
}
