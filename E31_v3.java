import java.util.Random;

public class E31_v3 {

    public static void main(String[] args){

        int max = 1;
        int min = 100;
        int max2 = 1;
        int min2 = 100;
        int total = 0;
        double average;
        int count = 1;

        Random random = new Random();

        while (count <= 10){
            int num = random.nextInt(0,100) + 1;

            total += num;

            if (num >= max){
                max = num;
            }else {
                if (num >= max2){
                    max2 = num;
                }
            }

            if (num <= min){
                min = num;
            }else {
                if (num <= min2){
                    min2 = num;
                }
            }
        }

        average = total / 10;
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Max = " + max);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    //用while写！！！
}
