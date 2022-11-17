import java.io.File;
import java.util.Scanner;
public class E4 {
    public static void main(String[] args) throws Exception {

        String filename = "D:\\桌面\\大学\\高程\\实验报告\\实验四\\data1.txt";
        int op1,op2,op3,result=0;
        String operator1,operator2;
        // create a scanner from the data file
        Scanner scanner = new Scanner(new File(filename));

        // 重复从文件中读取数据
        while (scanner.hasNext()) {
            // retrieve each data element
            op1 = scanner.nextInt();
            operator1 = scanner.next();
            op2 = scanner.nextInt();
            operator2 = scanner.next();
            op3 = scanner.nextInt();

            if (operator1.equals("*")){
                result = op1 * op2;
                if (operator2.equals("+")){
                    result = result + op3;
                } else if (operator2.equals("-")) {
                    result = result - op3;
                } else if (operator2.equals("*")) {
                    result = result * op3;
                } else if (operator2.equals("/")) {
                    result = result / op3;
                }
            } else if (operator1.equals("/")){
                result = op1 * op2;
                if (operator2.equals("+")){
                    result = result + op3;
                } else if (operator2.equals("-")) {
                    result = result - op3;
                } else if (operator2.equals("*")) {
                    result = result * op3;
                } else if (operator2.equals("/")) {
                    result = result / op3;
                }
            }else if (operator1.equals("+")){
                result = op1 * op2;
                if (operator2.equals("+")){
                    result = result + op3;
                } else if (operator2.equals("-")) {
                    result = result - op3;
                }
            }else if (operator1.equals("-")){
                result = op1 * op2;
                if (operator2.equals("+")){
                    result = result + op3;
                } else if (operator2.equals("-")) {
                    result = result - op3;
                } else if (operator2.equals("*")) {
                    result = result * op3;
                } else if (operator2.equals("/")) {
                    result = result / op3;
                }
            }




            System.out.println("result is " + result);
        }
        scanner.close(); // also closes the File
    }
}
