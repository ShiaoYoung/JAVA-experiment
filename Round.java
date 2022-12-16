import javax.swing.plaf.PanelUI;

public class Round extends Shape{
    private double r;
    private double S,C;
    public Round(double r){
        this.r = r;
    }
    @Override
    public double getS() {
        S = Math.PI * r * r / 2;
        return S;
    }
    @Override
    public double getC() {
        C = Math.PI * r * 2;
        return C;
    }
}
