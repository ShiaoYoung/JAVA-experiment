public class Rectangular extends Shape{

    private double length,width;
    private double S,C;
    public Rectangular(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getS() {
        S = length * width;
        return S;
    }

    @Override
    public double getC() {
        C = 2 * (length + width);
        return C;
    }
}
