package Figs;

public class circulo extends Fig{
    private double raio;

    public double getPi() {
        return pi;
    }

    private double pi = 3.14;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double area(){
        setArea(getPi()*getRaio()*getRaio());
        double fig = getArea();
        return fig;
    }
}
