import java.util.Random;

public class E31 {
    public  static void main(String[] args){


        //随机生成10个整数
        Random random = new Random();

        int num1 = random.nextInt(0,100) + 1;
        int num2 = random.nextInt(0,100) + 1;
        int num3 = random.nextInt(0,100) + 1;
        int num4 = random.nextInt(0,100) + 1;
        int num5 = random.nextInt(0,100) + 1;
        int num6 = random.nextInt(0,100) + 1;
        int num7 = random.nextInt(0,100) + 1;
        int num8 = random.nextInt(0,100) + 1;
        int num9 = random.nextInt(0,100) + 1;
        int num10 = random.nextInt(0,100) + 1;

        //设置中间变量
        int num01,num02,num03,num04,num05;
        int num001,num002;
        int num0001;
        int mnum01,mnum02,mnum03,mnum04,mnum05;
        int mnum001,mnum002;
        int mnum0001;
        int max,min,scmax,scmin;


        //计算10个整数的总和
        int total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

        //计算平均值
        int average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;

        //计算最大值、第二大数值
        if (num1 > num2){
            num01 = num1;
        }else {
            num01 = num2;
        }

        if (num3 > num4){
            num02 = num3;
        }else {
            num02 = num4;
        }

        if (num5 > num6){
            num03 = num5;
        }else {
            num03 = num6;
        }

        if (num7 > num8){
            num04 = num7;
        }else {
            num04 = num8;
        }

        if (num9 > num10){
            num05 = num9;
        }else {
            num05 = num10;
        }

        if (num01 > num02){
            num001 = num01;
        }else {
            num001 = num02;
        }

        if (num03 > num04){
            num002 = num03;
        }else {
            num002 = num04;
        }

        if (num001 > num002){
            num0001 = num001;
        }else {
            num0001 = num002;
        }

        if (num0001 > num05){
            max = num0001;
            scmax = num05;
        }else {
            max = num05;
            scmax = num0001;
        }


        //计算最小值、第二小数值
        if (num1 < num2){
            mnum01 = num1;
        }else {
            mnum01 = num2;
        }

        if (num3 < num4){
            mnum02 = num3;
        }else {
            mnum02 = num4;
        }

        if (num5 < num6){
            mnum03 = num5;
        }else {
            mnum03 = num6;
        }

        if (num7 < num8){
            mnum04 = num7;
        }else {
            mnum04 = num8;
        }

        if (num9 < num10){
            mnum05 = num9;
        }else {
            mnum05 = num10;
        }

        if (mnum01 < mnum02){
            mnum001 = mnum01;
        }else {
            mnum001 = mnum02;
        }

        if (mnum03 < mnum04){
            mnum002 = mnum03;
        }else {
            mnum002 = mnum04;
        }

        if (mnum001 < mnum002){
            mnum0001 = mnum001;
        }else {
            mnum0001 = mnum002;
        }

        if (mnum0001 < mnum05){
            min = mnum0001;
            scmin = mnum05;
        }else {
            min = mnum05;
            scmin = mnum0001;
        }


        //打印10个数
        System.out.println("10个数分别为：");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);


        //打印总和、算术平均数、最大值、最小值、第二最大值、第二最小值
        System.out.println("总和为：" + total);
        System.out.println("算数平均数为" + average);
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("第二最大值为：" + scmax);
        System.out.println("第二最小值为：" + scmin);

    }
}
