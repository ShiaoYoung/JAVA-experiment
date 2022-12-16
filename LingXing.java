import javax.swing.plaf.PanelUI;

public class LingXing extends Shape{

    private double a,b;
    private double S,C;

    public LingXing(double a,double b){
        this.a = a;
        if (b > 0 && b < Math.PI){
            this.b = b;
        }
    }
    @Override
    public double getS() {
        S = Math.sin(b / 2) * Math.cos(b / 2) * a * a * 2;
        return S;
    }

    @Override
    public double getC() {
        C = 4 * a;
        return C;
    }
}
