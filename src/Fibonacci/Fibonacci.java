package Fibonacci;

public class Fibonacci {
    public int calculaFibonacci(int i){
        if(i < 2) return i;
        return calculaFibonacci(i-1) + calculaFibonacci(i-2);
    }
}
