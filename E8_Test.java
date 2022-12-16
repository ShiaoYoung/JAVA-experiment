import java.util.Random;

public class E8_Test {
    public static void main(String[] args) {
        ArrayInList test1 = new ArrayInList();
        ArrayInList test2 = new ArrayInList();
        ArrayInList test3 = new ArrayInList();

        Random rdm = new Random();
        long start1 = 0,end1;
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        System.out.println("Append尾部测试：");
        for (int i = 0; i < 500000; i++){
            if (count1 == 0){
                start1 = System.currentTimeMillis();
            }
            test1.Append(rdm.nextInt(1,50000));
            count1++;
            if (count1 == 9999){
                end1 = System.currentTimeMillis();
                System.out.print((end1 - start1) + "毫秒。");
                count1 = 0;
                count++;
            }
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
        count = 0;
        System.out.println();

        System.out.println("Insert头部测试：");
        for (int i = 0; i < 500000; i++){
            if (count2 == 0){
                start1 = System.currentTimeMillis();
            }
            test2.Insert(0,rdm.nextInt(0,5000000));
            count2++;
            if (count2 == 9999){
                end1 = System.currentTimeMillis();
                System.out.print((end1 - start1) + "毫秒。");
                count2 = 0;
                count++;
            }
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
        count = 0;
        System.out.println();

        System.out.println("Insert随机位置测试：");
        test3.Append("666");
        for (int i = 0; i < 500000; i++){
            if (count3 == 0){
                start1 = System.currentTimeMillis();
            }
            test3.Insert(rdm.nextInt(0, test3.length()), rdm.nextInt(0,5000000));
            count3++;
            if (count3 == 9999){
                end1 = System.currentTimeMillis();
                System.out.print((end1 - start1) + "毫秒。");
                count3 = 0;
                count++;
            }
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
