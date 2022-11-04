import java.util.Random;

public class E31_v2 {
    public static void main(String[] args){

        Random rdm = new Random();
        int count;          //次数
        int num;            //随机获取的数字
        int total = 0;      //总和
        double average;     //平均数
        int max = 0;        //最大值
        int min = 101;      //最小值
        int scmax = 0;      //第二大数值
        int scmin = 101;    //第二小数值

        for (count = 0;count <= 9;count++){

            //随机生成10个1-100内的整数
            num = rdm.nextInt(0,100) + 1;

            //计算总和
            total += num;

            //计算最大值与第二大数值
            if (num >= max){
                max = num;
            }else {
                if (num >= scmax){
                    scmax = num;
                }
            }

            //计算最小值与第二小数值
            if (num <= min){
                min = num;
            }else {
                if (num <= scmin){
                    scmin = num;
                }
            }
        }

        //计算算数平均数
        average = (double) total / 10;
        //输出总和
        System.out.println("总和为：" + total);
        //输出算数平均数
        System.out.println("算术平均数为：" + average);
        //输出最大值
        System.out.println("最大值为：" + max);
        //输出最小值
        System.out.println("最小值为：" + min);
        //输出第二大数值
        System.out.println("第二大数值为：" + scmax);
        //输出第二小数值
        System.out.println("第二小数值为：" + scmin);

    }
}
