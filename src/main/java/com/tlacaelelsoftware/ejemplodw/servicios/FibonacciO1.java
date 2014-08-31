package com.tlacaelelsoftware.ejemplodw.servicios;

public class FibonacciO1 implements Fibonacci {
    private static final Double raizCinco = Math.sqrt(5);
    private static final Double raizCincoInverso = 1/raizCinco;
    private static final Double eigen1 = (raizCinco + 1) / 2;
    private static final Double eigen2 = (raizCinco - 1) / 2;

    @Override
    public Long fib(Integer n) {
        return (long) (((Math.pow(eigen1, (n + 1)) + (Math.pow(eigen2, (n + 1))))) * raizCincoInverso);
    }
}
