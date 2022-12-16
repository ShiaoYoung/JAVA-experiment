import java.util.ArrayList;

abstract public class Shape {
    abstract public double getS();
    abstract public double getC();

    public static void row(Shape ... shapes){
        ArrayList temp = new ArrayList<>();
        int i = 0;
        for (Shape shape : shapes){
            temp.set(i, shape);
            i++;
        }

    }
}
