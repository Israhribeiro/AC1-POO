package Figs;

public class triangulo extends quadrado{
    public double area(){
        setArea((getBase()*getAltura())/2);
        double fig = getArea();
        return fig;
    }
}
