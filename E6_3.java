import java.io.File;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;
import java.util.Scanner;

public class E6_3 {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Format fmt = new DecimalFormat("0.###");
        String file = "e6_2.txt";
        Scanner scanner = new Scanner(new File(file));
        int count_s = 0;
        int count_z = 0;
        String strs = "";

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            strs += str;
        }
        strs = strs.replaceAll(" ", "");
        for (int i = 0; i < strs.length(); i++) {
            if (strs.charAt(i) == 's') {
                count_s++;
            }
        }
        for (int j = 0; j < strs.length(); j++) {
            if (strs.charAt(j) == 'z') {
                count_z++;
            }
        }
        double GroundTruth_s = (double) count_s / strs.length();
        double GroundTruth_z = (double) count_z / strs.length();

        System.out.println("出现s的频率为：" + fmt.format(GroundTruth_s));
        System.out.println("出现z的频率为：" + fmt.format(GroundTruth_z));

        String strs_bk = strs;

//随机取样100个字符
        //随机采样,统计's'的出现频率
        String tempstr1 = "";
        for (int i = 0; i <= 100; i++) {
            int j = random.nextInt(0, strs_bk.length() - 1);
            tempstr1 += strs_bk.charAt(j);
        }

        int count_s1 = 0;
        for (int i = 0; i < tempstr1.length(); i++) {
            if (tempstr1.charAt(i) == 's') {
                count_s1++;
            }
        }
        double result = (double) count_s1 / tempstr1.length();
        System.out.println("随机抽样100个字符，出现s的频率为：" + fmt.format(result));

        //随机采样,统计'z'的出现频率
        String tempstr2 = "";
        for (int i = 0; i <= 100; i++) {
            int j = random.nextInt(0, strs_bk.length() - 1);
            tempstr2 += strs_bk.charAt(j);
        }

        int count_z2 = 0;
        for (int i = 0; i < tempstr2.length(); i++) {
            if (tempstr2.charAt(i) == 'z') {
                count_z2++;
            }
        }
        double result2 = (double) count_z2 / tempstr2.length();
        System.out.println("随机抽样100个字符，出现z的频率为：" + fmt.format(result2));


//随机取样1000个字符
        //随机采样,统计's'的出现频率
        String tempstr01 = "";
        for (int i = 0; i <= 1000; i++) {
            int j = random.nextInt(0, strs_bk.length() - 1);
            tempstr01 += strs_bk.charAt(j);
        }

        int count_s01 = 0;
        for (int i = 0; i < tempstr01.length(); i++) {
            if (tempstr01.charAt(i) == 's') {
                count_s01++;
            }
        }
        double result0 = (double) count_s01 / tempstr01.length();
        System.out.println("随机抽样1000个字符，出现s的频率为：" + fmt.format(result0));

        //随机采样,统计'z'的出现频率
        String tempstr02 = "";
        for (int i = 0; i <= 1000; i++) {
            int j = random.nextInt(0, strs_bk.length() - 1);
            tempstr02 += strs_bk.charAt(j);
        }

        int count_z02 = 0;
        for (int i = 0; i < tempstr02.length(); i++) {
            if (tempstr02.charAt(i) == 'z') {
                count_z02++;
            }
        }
        double result02 = (double) count_z02 / tempstr02.length();
        System.out.println("随机抽样1000个字符，出现z的频率为：" + fmt.format(result02));


//随机取样10000个字符
        //随机采样,统计's'的出现频率
        String tempstr001 = "";
        for (int i = 0; i <= 10000; i++) {
            int j = random.nextInt(0, strs_bk.length() - 1);
            tempstr001 += strs_bk.charAt(j);
        }

        int count_s001 = 0;
        for (int i = 0; i < tempstr001.length(); i++) {
            if (tempstr001.charAt(i) == 's') {
                count_s001++;
            }
        }
        double result00 = (double) count_s001 / tempstr001.length();
        System.out.println("随机抽样10000个字符，出现s的频率为：" + fmt.format(result00));

        //随机采样,统计'z'的出现频率
        String tempstr002 = "";
        for (int i = 0; i <= 1000; i++) {
            int j = random.nextInt(0, strs_bk.length() - 1);
            tempstr002 += strs_bk.charAt(j);
        }

        int count_z002 = 0;
        for (int i = 0; i < tempstr002.length(); i++) {
            if (tempstr002.charAt(i) == 'z') {
                count_z002++;
            }
        }
        double result002 = (double) count_z002 / tempstr002.length();
        System.out.println("随机抽样1000个字符，出现z的频率为：" + fmt.format(result002));




    }
}