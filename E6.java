import java.io.File;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args)throws Exception{
        String str = "test";
        str = str.replaceAll(" ","");
        int count = 0;
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i) == 's'){
                count++;
            }
        }
        double result = (double) count / str.length();
        System.out.println("percentage of 's' is " + result);

    }
}
