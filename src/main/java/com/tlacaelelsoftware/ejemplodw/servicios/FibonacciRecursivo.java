package com.tlacaelelsoftware.ejemplodw.servicios;

public class FibonacciRecursivo implements Fibonacci {
    @Override
    public Long fib(Integer n) {
        if ((n == 0) || (n == 1)) return 1L;
        return fib(n - 1) + fib(n - 2);
    }
}
