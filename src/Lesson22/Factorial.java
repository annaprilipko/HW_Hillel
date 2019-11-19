package Lesson22;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class Factorial implements Callable<BigInteger> {

    @Override
    public BigInteger call() throws Exception {
        BigInteger factorial  = BigInteger.valueOf(1);
        int n = 50;

        for (int i = 1; i <= n; i++){
            if (!Thread.currentThread().isInterrupted()){
                factorial = factorial.multiply(BigInteger.valueOf(i));
                System.out.println(i);
            } else break;

        }

        return factorial;
    }
}
