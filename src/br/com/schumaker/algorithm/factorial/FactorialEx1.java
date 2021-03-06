package br.com.schumaker.algorithm.factorial;

import java.math.BigInteger;

/**
 *
 * @author Hudson Schumaker
 */
public class FactorialEx1 {
    public static void main(String[] args) {
        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(num));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
