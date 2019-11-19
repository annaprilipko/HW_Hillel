package Lesson22.Fibonachy;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class Fibonachy implements Callable<BigInteger> {

    private PairOfFibonachy pairOfFibonachy;

    public Fibonachy(PairOfFibonachy pairOfFibonachy) {
        this.pairOfFibonachy = pairOfFibonachy;
    }

    @Override
    public BigInteger call() {
        BigInteger n0 = pairOfFibonachy.getNumber1();
        BigInteger n1 = pairOfFibonachy.getNumber2();
        BigInteger n2;
        BigInteger firstFinal;
        BigInteger lastFinal = BigInteger.valueOf(0);

        for (int i = 0; i < 100 ; i++) {
            if(!Thread.currentThread().isInterrupted()){
                n2 = n0.add(n1);
                n0 = n1;
                n1 = n2;
                firstFinal = n0;
                lastFinal = n1;
                pairOfFibonachy.setNumber1(firstFinal);
                pairOfFibonachy.setNumber2(lastFinal);
                System.out.println(pairOfFibonachy.getNumber1());
                System.out.println(pairOfFibonachy.getNumber2());
            }
        }

        return lastFinal;
    }

}
