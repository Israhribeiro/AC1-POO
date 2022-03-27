package Figs;

import java.util.Scanner;

public class Executando {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        quadrado quad = new quadrado();
        triangulo trian = new triangulo();
        circulo circ = new circulo();
        retangulo reta = new retangulo();
        int sair = 1;
        while(sair == 1) {
            System.out.println("Oque vocë deseja calcular?\n 1)Quadrado \n 2)Triangulo \n 3)Circulo \n 4)Retangulo \n 5)sair");
            int le = ler.nextInt();
            if(le == 1){
                System.out.println("Qual o valor da base do quadrado?");
                quad.setNome("quadrado");
                double leia = ler.nextDouble();
                quad.setBase(leia);
                System.out.println("Qual o valor da altura do quadrado?");
                leia = ler.nextDouble();
                quad.setAltura(leia);
                System.out.println("A area do seu "+ quad.getNome() +" é igual a = " + quad.area());
            }
            if(le == 2){
                System.out.println("Qual o valor da base do seu Triangulo?");
                trian.setNome("Triango");
                double leia = ler.nextDouble();
                trian.setBase(leia);
                System.out.println("Qual o valor da altura do seu Triangulo?");
                leia = ler.nextDouble();
                trian.setAltura(leia);
                System.out.println("A area do seu " + trian.getNome() + " é igual a = " + trian.area());
            }
            if(le == 3) {
                System.out.println("Qual o raio do seu circulo?");
                double leia = ler.nextDouble();
                circ.setNome("Circulo");
                circ.setRaio(leia);
                System.out.println("A area do seu "+ circ.getNome() + " é aproximada de " +circ.area());
            }
            if(le == 4){
                System.out.println("Qual o valor da base do Retangulo?");
                reta.setNome("Retangulo");
                double leia = ler.nextDouble();
                reta.setBase(leia);
                System.out.println("Qual o valor da altura do Retangulo?");
                leia = ler.nextDouble();
                reta.setAltura(leia);
                System.out.println("A area do seu "+ reta.getNome() +" é igual a = " + reta.area());

            }if(le == 5){
                break;
            }

        }
    }
}
