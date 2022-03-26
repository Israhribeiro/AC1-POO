package Fibonacci;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int a = fibonacci.calculaFibonacci(i);
            System.out.print(a);
            if(i < 6) System.out.print(", ");
        }
    }
}
