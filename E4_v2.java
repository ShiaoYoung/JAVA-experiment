import java.io.File;
import java.util.Scanner;
public class E4_v2 {
    public static void main(String[] args) throws Exception {

        //未完成！！！！！！！！！！！！！！！！
        String filename = "D:\\桌面\\大学\\高程\\实验报告\\data2.txt";
        int a,b,c,result=0;
        String op1,op2,op3,op4;
        // create a scanner from the data file
        Scanner scanner = new Scanner(new File(filename));

        a = scanner.nextInt();
        op1 = scanner.next();
        b = scanner.nextInt();

        while (scanner.hasNext()){
            op2 = scanner.next();
            c = scanner.nextInt();

            switch (op1){
                case "*":{
                    a = a * b;
                    op1 = op2;
                    break;
                }
                case "/":{
                    a = a / b;
                    op1 = op2;
                    break;
                }
                default:{
                    if (scanner.hasNext()){
                        op3 = scanner.next();
                        int d = scanner.nextInt();
                        switch (op2){

                        }
                    }else
                        switch (op2) {
                            case "/" -> {
                                b = b / c;
                                if (op1.equals("+")) {
                                    result = a + b;
                                } else {
                                    result = a - b;
                                }
                            }
                            case "*" -> {
                                b = b * c;
                                if (op1.equals("+")) {
                                    result = a + b;
                                } else {
                                    result = a - b;
                                }
                            }
                        }
                }


            }
        }

        scanner.close(); // also closes the File
    }
}
