package Figs;

public class quadrado extends Fig{
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double base;
    public double area(){
        setArea(getBase()*getAltura());
        double fig = getArea();
        return fig;
    }

}
