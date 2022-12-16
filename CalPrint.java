public class CalPrint {

    public static void getCal1(int m){
        switch (m){
            case 1 -> {
                int i = 7;
                System.out.println(" " + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                int i = 4;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3);
                while (i <= 28){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 28){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 3 -> {
                int i = 4;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 4 -> {
                int i = 8;
                System.out.println(" " + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7);
                while (i <= 30){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 5 -> {
                int i = 6;
                System.out.println(" " + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 6 -> {
                int i = 3;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2);
                while (i <= 30){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 7 -> {
                int i = 8;
                System.out.println(" " + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 8 -> {
                int i = 5;
                System.out.println(" " + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 9 -> {
                int i = 2;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1);
                while (i <= 30){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 10 -> {
                int i = 7;
                System.out.println(" " + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6);
                while (i <= 30){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 11 -> {
                int i = 4;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3);
                while (i <= 30){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
            case 12 -> {
                int i = 2;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }

            }
        }
    }
    public static void getCal2(int m){
        switch (m){
            case 1 -> {
                int i = 7;
                int j = 4;
                System.out.println("   " + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6  +
                                "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3);
                while (i <= 31 || j <= 28){
                    System.out.print(" ");
                    for (int count1 = 1;count1 <= 7; count1++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                            if(i == 31){
                                System.out.print("\t" + "\t" +"\t");
                            }
                            i++;
                        }
                    }
                    System.out.print("\t");
                    for (int count2 = 1;count2 <= 7;count2++){
                        if (j <= 28){
                            System.out.print(j + "\t");
                            j++;
                        }
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                int i = 4;
                int j = 4;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 +
                                    "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3);
                while (i <= 28 || j <= 31){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <= 7; count1++){
                        if (i <= 28){
                            System.out.print(i + "\t");
                            if (i == 28){
                                System.out.print("\t" + "\t" +"\t");
                            }
                            i++;
                        }
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j <= 31){
                            System.out.print(j + "\t");
                            j++;
                        }
                    }
                    System.out.println();
                }
            }
            case 3 -> {
                int i = 4;
                int j = 8;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 +
                                    "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7);
                while (i <= 31 || j <= 30){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        System.out.print(i + "\t");
                        if (i == 31){
                            System.out.print("");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <= 7; count2++){
                        if (j <= 30){
                            System.out.print(j + "\t");
                            j++;
                        }
                    }
                    System.out.println();
                }
            }
            case 4 -> {
                int i = 8;
                int j = 6;
                System.out.println(" " + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7+
                                    "\t" + "\t" + "\t" + "\t" +  1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5);
                while (i <= 30 || j <=31){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        if (i == 30){
                            System.out.print("\t" + "\t" + "\t" + "\t" + "\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <= 7; count2++){
                        if (j <= 31){
                            System.out.print(j + "\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 5 -> {
                int i = 6;
                int j = 3;
                System.out.println(" " + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 +
                                    "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2);
                while (i <= 31 || j <= 30){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        if (i == 31){
                            System.out.print("\t" + "\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j <= 30){
                            System.out.print(j + "\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 6 -> {
                int i = 3;
                int j = 8;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2+
                                "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7);
                while (i <= 30 || j <= 31){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        if (i == 30){
                            System.out.print("");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j <= 31){
                            System.out.print(j + "\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 7 -> {
                int i = 8;
                int j = 5;
                System.out.println(" " + 1 + "\t" + 2+ "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7 +
                        "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4);
                while (i <= 31 || j <= 31){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        if (i == 31){
                            System.out.print("\t" + "\t" + "\t" + "\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j <= 31){
                            System.out.print(j + "\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 8 -> {
                int i = 5;
                int j = 2;
                System.out.println(" " + "\t" + "\t" + "\t" + 1 + "\t" + 2+ "\t" + 3 + "\t" + 4 +
                        "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1);
                while (i <= 31 || j <= 30){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        if (i == 31){
                            System.out.print("\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j < 30){
                            System.out.print(j + "\t");
                        }
                        if (j == 30){
                            System.out.print(" " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + j);
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 9 -> {
                int i = 2;
                int j = 7;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1+
                                    "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6);
                while (i <= 30 || j <= 31){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j <= 31){
                            System.out.print(j + "\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 10 -> {
                int i = 7;
                int j = 4;
                System.out.println(" " + "\t" + 1 + "\t" + 2+ "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 +
                        "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2 + "\t" + 3);
                while (i <= 31 || j <= 30){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        if (i == 31){
                            System.out.print("\t" + "\t" + "\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j <= 30){
                            System.out.print(j + "\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
            case 11 -> {
                int i = 4;
                int j = 2;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + 1 + "\t" + 2+ "\t" + 3 +
                        "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1);
                while (i <= 30 || j <= 30){
                    System.out.print(" ");
                    for (int count1 = 1; count1 <=7; count1++){
                        if (i <= 30){
                            System.out.print(i + "\t");
                        }
                        if (i == 30){
                            System.out.print("\t");
                        }
                        i++;
                    }
                    System.out.print("\t");
                    for (int count2 = 1; count2 <=7; count2++){
                        if (j < 30){
                            System.out.print(j + "\t");
                        }
                        if (j == 30){
                            System.out.print(" " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + j + "\t");
                        }
                        if (j == 31){
                            System.out.print(j);
                        }
                        j++;
                    }
                    System.out.println();
                }

            }
            case 12 -> {
                int i = 2;
                System.out.println(" " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + 1);
                while (i <= 31){
                    System.out.print(" ");
                    for (int count = 1; count <= 7; count++){
                        if (i <= 31){
                            System.out.print(i + "\t");
                        }
                        i++;
                    }
                    System.out.println();
                }
            }
        }
    }
}