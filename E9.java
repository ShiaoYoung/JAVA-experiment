import javax.swing.*;
import java.util.Random;

public class E9 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        Random rdm = new Random();

        for (int i = 0; i < 20; i++){
            int temp;
            temp = rdm.nextInt(1,5);
            switch (temp){
                case 1 -> shapes[i] = new Rectangular(rdm.nextDouble(), rdm.nextDouble());
                case 2 -> shapes[i] = new Square(rdm.nextDouble());
                case 3 -> shapes[i] = new LingXing(rdm.nextDouble(), rdm.nextDouble());
                case 4 -> shapes[i] = new Round(rdm.nextDouble());
            }
        }











    }
}
