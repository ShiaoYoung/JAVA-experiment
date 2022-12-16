public class Square extends Shape{
    private double a;
    private double S,C;

    public Square(double a){
        this.a = a;
    }
    @Override
    public double getS() {
        S = a * a;
        return S;
    }

    @Override
    public double getC() {
        C = a * 4;
        return C;
    }
}
