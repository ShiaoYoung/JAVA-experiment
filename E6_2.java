import java.io.File;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;
import java.util.Scanner;

public class E6_2 {
    public static void main(String[] args)throws Exception{

        Format fmt = new DecimalFormat("0.###");
        String file = "e6_1.txt";
        Scanner scanner = new Scanner(new File(file));
        int count_s = 0;
        int count_z = 0;
        int length = 0;
        String strs = "";

        while (scanner.hasNext()){
            String str = scanner.nextLine();
            strs += str;
        }
        strs = strs.replaceAll(" ","");
        for (int i = 0; i < strs.length(); i++){
            if (strs.charAt(i) == 's'){
                count_s++;
            }
        }
        for (int j = 0; j < strs.length(); j++){
            if (strs.charAt(j) == 'z'){
                count_z++;
            }
        }
        double GroundTruth_s = (double) count_s / strs.length();
        double GroundTruth_z = (double) count_z / strs.length();

        System.out.println("出现s的频率为：" + fmt.format(GroundTruth_s));
        System.out.println("出现z的频率为：" + fmt.format(GroundTruth_z));


        /*while (scanner.hasNext()){
            String str= scanner.nextLine();
            str = str.replaceAll(" ","");
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 's'){
                    count_s++;
                }
            }
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == 'z'){
                    count_z++;
                }
            }
            length += str.length();
        }
        double GroundTruth_s = (double) count_s / length;
        double GroundTruth_z = (double) count_z / length;

        System.out.println("出现s的频率为：" + fmt.format(GroundTruth_s));
        System.out.println("出现z的频率为：" + fmt.format(GroundTruth_z));
         */

    }
}
