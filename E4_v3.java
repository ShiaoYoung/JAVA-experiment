import java.io.File;
import java.util.Scanner;

public class E4_v3 {
    public static void main(String[] args) throws Exception {

        int result = 0;
        String FilePath = "D:\\桌面\\大学\\高程\\实验报告\\实验四\\data2.txt";
        Scanner scanner = new Scanner(new File(FilePath));
        //如果有下一行，则继续读取
        while (scanner.hasNext()){
            //先读一个数字、一个运算符、一个数字，如果是乘除，则进行运算；如果是加减，则读第二个运算符
            int n1 = scanner.nextInt();
            String o1 = scanner.next();
            int n2 = scanner.nextInt();
            if (o1.equals("/") || o1.equals("*")){
                int nu1 = 0;
                switch (o1){
                    case "/" -> nu1 = n1 / n2;
                    case "*" -> nu1 = n1 * n2;
                }
                if (scanner.hasNext() && !scanner.hasNextInt()){
                    String o2 = scanner.next();
                    int n3 = scanner.nextInt();
                    if (o2.equals("/") || o2.equals("*")){
                        int nu2 = 0;
                        switch (o2){
                            case "/" -> nu2 = nu1 / n3;
                            case "*" -> nu2 = nu1 * n3;
                        }
                        if (scanner.hasNext() && !scanner.hasNextInt()){
                            String o3 = scanner.next();
                            int n4 = scanner.nextInt();
                            if (o3.equals("/") || o3.equals("*")){
                                int nu3 = 0;
                                switch (o3){
                                    case "/" -> nu3 = nu2 / n4;
                                    case "*" -> nu3 = nu2 * n4;
                                }
                                if (scanner.hasNext() && !scanner.hasNextInt()){
                                    String o4 = scanner.next();
                                    int n5 = scanner.nextInt();
                                    if (o4.equals("/") || o4.equals("*")){
                                        switch (o4){
                                            case "/" -> result = nu3 / n5;
                                            case "*" -> result = nu3 * n5;
                                        }
                                    }else {
                                        switch (o4){
                                            case "+" -> result = nu3 + n5;
                                            case "-" -> result = nu3 - n5;
                                        }
                                    }
                                }else {
                                    result = nu3;
                                }
                            }else {
                                if (scanner.hasNext() && !scanner.hasNextInt()){
                                    String o4 = scanner.next();
                                    int n5 = scanner.nextInt();
                                    if (o4.equals("/") || o4.equals("*")){
                                        int nu4 = 0;
                                        switch (o4){
                                            case "/" -> nu4 = n4 / n5;
                                            case "*" -> nu4 = n4 * n5;
                                        }
                                        switch (o3){
                                            case "+" -> result = nu2 + nu4;
                                            case "-" -> result = nu2 - nu4;
                                        }
                                    }else {
                                        switch (o3){
                                            case "+" -> nu2 = nu2 + n4;
                                            case "-" -> nu2 = nu2 - n4;
                                        }
                                        switch (o4){
                                            case "+" -> result = nu2 + n5;
                                            case "-" -> result = nu2 - n5;
                                        }
                                    }
                                }else {
                                    switch (o3){
                                        case "+" -> result = nu2 + n4;
                                        case "-" -> result = nu2 - n4;
                                    }
                                }
                            }
                        }else {
                            result = nu2;
                        }
                    }else {
                        if (scanner.hasNext() && !scanner.hasNextInt()){
                            String o3 = scanner.next();
                            int n4 = scanner.nextInt();
                            if (o3.equals("/") || o3.equals("*")){
                                int nu3 = 0;
                                switch (o3){
                                    case "/" -> nu3 = n3 / n4;
                                    case "*" -> nu3 = n3 * n4;
                                }
                                if (scanner.hasNext() && !scanner.hasNextInt()){
                                    String o4 = scanner.next();
                                    int n5 = scanner.nextInt();
                                    if (o4.equals("/") || o4.equals("*")){
                                        switch (o4){
                                            case "/" -> nu3 = nu3 / n5;
                                            case "*" -> nu3 = nu3 * n5;
                                        }
                                        switch (o2){
                                            case "+" -> result = nu1 + nu3;
                                            case "-" -> result = nu1 - nu3;
                                        }
                                    }else {
                                        switch (o4){
                                            case "+" -> nu3 = nu3 + n5;
                                            case "-" -> nu3 = nu3 - n5;
                                        }
                                        switch (o2){
                                            case "+" -> result = nu1 + nu3;
                                            case "-" -> result = nu1 - nu3;
                                        }
                                    }
                                }else {
                                    switch (o2){
                                        case "+" -> result = nu1 + nu3;
                                        case "-" -> result = nu1 - nu3;
                                    }
                                }
                            }else {
                                if (scanner.hasNext() && !scanner.hasNextInt()){
                                    String o4 = scanner.next();
                                    int n5 = scanner.nextInt();
                                    if (o4.equals("/") || o4.equals("*")){
                                        int nu4 = 0;
                                        switch (o4){
                                            case "/" -> nu4 = n4 / n5;
                                            case "*" -> nu4 = n4 * n5;
                                        }
                                        switch (o2){
                                            case "+" -> nu1 = nu1 + n3;
                                            case "-" -> nu1 = nu1 - n3;
                                        }
                                        switch (o3){
                                            case "+" -> result = nu1 + nu4;
                                            case "-" -> result = nu1 - nu4;
                                        }
                                    }else {
                                        switch (o2){
                                            case "+" -> nu1 = nu1 + n3;
                                            case "-" -> nu1 = nu1 - n3;
                                        }
                                        switch (o3){
                                            case "+" -> nu1 = nu1 + n4;
                                            case "-" -> nu1 = nu1 - n4;
                                        }
                                        switch (o4){
                                            case "+" -> result = nu1 + n5;
                                            case "-" -> result = nu1 - n5;
                                        }
                                    }
                                }else {
                                    switch (o2){
                                        case "+" -> nu1 = nu1 + n3;
                                        case "-" -> nu1 = nu1 -n3;
                                    }
                                    switch (o3){
                                        case "+" -> result = nu1 + n4;
                                        case "-" -> result = nu1 - n4;
                                    }
                                }
                            }
                        }else {
                            switch (o2){
                                case "+" -> result = nu1 + n3;
                                case "-" -> result = nu1 - n3;
                            }
                        }
                    }
                }else {
                    result = nu1;
                }

            }else {
                String o2 = scanner.next();
                int n3 = scanner.nextInt();
                if (o2.equals("/") || o2.equals("*")){
                    int nu2 = 0;
                    switch (o2){
                        case "/" -> nu2 = n2 / n3;
                        case "*" -> nu2 = n2 * n3;
                    }
                    if (!scanner.hasNextInt() && scanner.hasNext()){
                        String o3 = scanner.next();
                        int n4 = scanner.nextInt();
                        if (o3.equals("/") || o3.equals("*")){
                            int nu3 = 0;
                            switch (o3){
                                case "/" -> nu3 = nu2 / n4;
                                case "*" -> nu3 = nu2 * n4;
                            }
                            if (scanner.hasNext() && !scanner.hasNextInt()){
                                String o4 = scanner.next();
                                int n5 = scanner.nextInt();
                                if (o4.equals("/") || o4.equals("*")){
                                    int nu4 = 0;
                                    switch (o4){
                                        case "/" -> nu4 = nu3 / n5;
                                        case "*" -> nu4 = nu3 * n5;
                                    }
                                    switch (o1){
                                        case "+" -> result = n1 + nu4;
                                        case "-" -> result = n1 - nu4;
                                    }
                                }else {
                                    switch (o4){
                                        case "+" -> nu3 = nu3 + n5;
                                        case "-" -> nu3 = nu3 - n5;
                                    }
                                    switch (o1){
                                        case "+" -> result = n1 + nu3;
                                        case "-" -> result = n1 - nu3;
                                    }
                                }
                            }else {
                                switch (o1){
                                    case "+" -> result = n1 + nu3;
                                    case "-" -> result = n1 - nu3;
                                }
                            }
                        } else {
                            if (scanner.hasNext() && !scanner.hasNextInt()){
                                String o4 = scanner.next();
                                int n5 = scanner.nextInt();
                                if (o4.equals("/") || o4.equals("*")){
                                    int nu4 = 0;
                                    switch (o4){
                                        case "/" -> nu4 = n4 / n5;
                                        case "*" -> nu4 = n4 * n5;
                                    }
                                    switch (o3){
                                        case "+" -> nu2 = nu2 + nu4;
                                        case "-" -> nu2 = nu2 - nu4;
                                    }
                                    switch (o1){
                                        case "+" -> result = n1 + nu2;
                                        case "-" -> result = n1 - nu2;
                                    }
                                }else {
                                    switch (o3){
                                        case "+" -> nu2 = nu2 + n4;
                                        case "-" -> nu2 = nu2 - n4;
                                    }
                                    switch (o4){
                                        case "+" -> nu2 = nu2 + n5;
                                        case "-" -> nu2 = nu2 - n5;
                                    }
                                    switch (o1){
                                        case "+" -> result = n1 + nu2;
                                        case "-" -> result = n1 - nu2;
                                    }
                                }
                            }else {
                                switch (o3){
                                    case "+" -> nu2 = nu2 + n4;
                                    case "-" -> nu2 = nu2 - n4;
                                }
                                switch (o1){
                                    case "+" -> result = n1 + nu2;
                                    case "-" -> result = n1 - nu2;
                                }
                            }

                        }
                    }else {
                        switch (o1) {
                            case "+" -> result = n1 + nu2;
                            case "-" -> result = n1 - nu2;
                        }
                    }
                }else {
                    if (scanner.hasNext() && !scanner.hasNextInt()){
                        String o3 = scanner.next();
                        int n4 = scanner.nextInt();
                        if (o3.equals("/") || o3.equals("*")){
                            int nu3 = 0;
                            switch (o3){
                                case "/" -> nu3 = n3 / n4;
                                case "*" -> nu3 = n3 * n4;
                            }
                            if (scanner.hasNext() && !scanner.hasNextInt()){
                                String o4 = scanner.next();
                                int n5 = scanner.nextInt();
                                int nu2 = 0;
                                if (o4.equals("/") || o4.equals("*")){
                                    switch (o4){
                                        case "/" -> nu3 = nu3 / n5;
                                        case "*" -> nu3 = nu3 * n5;
                                    }
                                    switch (o2){
                                        case "+" -> nu2 = nu3 + n2;
                                        case "-" -> nu2 = nu3 - n2;
                                    }
                                }else {
                                    int nu4 = 0;
                                    switch (o4){
                                        case "+" -> nu4 = nu3 + n5;
                                        case "-" -> nu4 = nu3 - n5;
                                    }
                                    switch (o2){
                                        case "+" -> nu2 = n2 + nu4;
                                        case "-" -> nu2 = n2 - nu4;
                                    }
                                    switch (o1){
                                        case "+" -> result = n1 + nu2;
                                        case "-" -> result = n1 - nu2;
                                    }
                                }

                            }else {
                                int nu1 = 0;
                                switch (o1){
                                    case "+" -> nu1 = n1 + n2;
                                    case "-" -> nu1 = n1 - n2;
                                }
                                switch (o2){
                                    case "+" -> result = nu1 + nu3;
                                    case "-" -> result = nu1 - nu3;
                                }
                            }
                        }else {
                            int nu1 = 0;
                            if (scanner.hasNext() && !scanner.hasNextInt()){
                                String o4 = scanner.next();
                                int n5 = scanner.nextInt();
                                if (o4.equals("/") || o4.equals("*")){
                                    int nu4 = 0;
                                    switch (o4){
                                        case "/" -> nu4 = n4 / n5;
                                        case "*" -> nu4 = n4 * n5;
                                    }
                                    switch (o1){
                                        case "+" -> nu1 = n1 + n2;
                                        case "-" -> nu1 = n1 - n2;
                                    }
                                    switch (o2){
                                        case "+" -> nu1 = nu1 + n3;
                                        case "-" -> nu1 = nu1 - n3;
                                    }
                                    switch (o3){
                                        case "+" -> result = nu1 + nu4;
                                        case "-" -> result = nu1 - nu4;
                                    }
                                }else {
                                    switch (o1){
                                        case "+" -> nu1 = n1 + n2;
                                        case "-" -> nu1 = n1 - n2;
                                    }
                                    switch (o2){
                                        case "+" -> nu1 = nu1 + n3;
                                        case "-" -> nu1 = nu1 - n3;
                                    }
                                    switch (o3){
                                        case "+" -> nu1 = nu1 + n4;
                                        case "-" -> nu1 = nu1 - n4;
                                    }
                                    switch (o4){
                                        case "+" -> result = nu1 + n5;
                                        case "-" -> result = nu1 - n5;
                                    }
                                }
                            }else {
                                switch (o1){
                                    case "+" -> nu1 = n1 + n2;
                                    case "-" -> nu1 = n1 - n2;
                                }
                                switch (o2){
                                    case "+" -> nu1 = nu1 + n3;
                                    case "-" -> nu1 = nu1 - n3;
                                }
                                switch (o3){
                                    case "+" -> result = nu1 + n4;
                                    case "-" -> result = nu1 - n4;
                                }
                            }
                        }
                    }else {
                        if (o2.equals("+")){
                            switch (o1){
                                case "+" -> result = n1 + n2 + n3;
                                case "-" -> result = n1 - n2 + n3;
                            }
                        }else {
                            switch (o1){
                                case "+" -> result = n1 + n2 - n3;
                                case "-" -> result = n1 - n2 - n3;
                            }
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
//a / b / c / d / e