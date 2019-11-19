package Lesson22.Fibonachy;

import java.math.BigInteger;

public class PairOfFibonachy {
    private BigInteger number1;
    private BigInteger number2;

    public PairOfFibonachy(BigInteger number1, BigInteger number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public BigInteger getNumber1() {
        return number1;
    }

    public void setNumber1(BigInteger number1) {
        this.number1 = number1;
    }

    public BigInteger getNumber2() {
        return number2;
    }

    public void setNumber2(BigInteger number2) {
        this.number2 = number2;
    }
}
