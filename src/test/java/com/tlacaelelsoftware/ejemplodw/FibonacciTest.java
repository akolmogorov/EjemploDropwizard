package com.tlacaelelsoftware.ejemplodw;

import com.tlacaelelsoftware.ejemplodw.servicios.Fibonacci;
import com.tlacaelelsoftware.ejemplodw.servicios.FibonacciO1;
import com.tlacaelelsoftware.ejemplodw.servicios.FibonacciRecursivo;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    @Test
    public void pruebaFib(){
        pruebaAlgoritmo(new FibonacciRecursivo());
        pruebaAlgoritmo(new FibonacciO1());
    }

    private void pruebaAlgoritmo(Fibonacci fibonacci) {
        assertTrue(fibonacci.fib(0) == 1L);
        assertTrue(fibonacci.fib(1) == 1L);
        assertTrue(fibonacci.fib(2) == 2L);
        assertTrue(fibonacci.fib(3) == 3L);
        assertTrue(fibonacci.fib(4) == 5L);
        assertTrue(fibonacci.fib(5) == 8L);
    }
}
