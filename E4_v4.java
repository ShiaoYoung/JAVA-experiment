import java.io.File;
import java.util.Scanner;

public class E4_v4 {
    public static void main(String[] args) throws Exception {

        String filename = "D:\\桌面\\大学\\高程\\实验报告\\实验四\\data2.txt";
        int result = 0;
        int op1,op2;
        String operator1;
        Scanner scanner = new Scanner(new File(filename));

        //判断是否有下一行
        while (scanner.hasNext()){

            op1 = scanner.nextInt();
            operator1 = scanner.next();
            op2 = scanner.nextInt();

            //判断此行是否结束
            while (!scanner.hasNextInt() && scanner.hasNext()){
                String operate2 = scanner.next();
                int op3 = scanner.nextInt();

                switch (operator1 + operate2){
                    case "++","+-" -> {
                        op1 = op1 + op2;
                        op2 = op3;
                        operator1 = operate2;
                    }
                    case "-+", "--" -> {
                        op1 = op1 - op2;
                        op2 = op3;
                        operator1 = operate2;
                    }
                    case "*+", "*-" -> {
                        op1 = op1 * op2;
                        op2 = op3;
                        operator1 = operate2;
                    }
                    case "/+", "/-" -> {
                        op1 = op1 / op2;
                        op2 = op3;
                        operator1 = operate2;
                    }
                    case "+*", "-*", "**", "/*" -> op2 = op2 * op3;
                    case "+/", "-/", "*/", "//" -> op2 = op2 / op3;
                }
            }
            switch (operator1){
                case "+" -> result = op1 + op2;
                case "-" -> result = op1 - op2;
                case "*" -> result = op1 * op2;
                case "/" -> result = op1 / op2;
            }

            //输出当前行的结果
            System.out.println("result is:" + result);

        }
        scanner.close();
    }
}

//*+,/+
//*-,/-