package project2;

import java.math.BigInteger;
import java.util.ArrayList;

public abstract class Calculator implements CalcBehavior {

    protected ArrayList numbers;
    protected double result;
    protected char symbol;

    public Calculator() {
    }

    public ArrayList getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList numbers) {
        this.numbers = numbers;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public abstract double calc();

    @Override
    public String toString() {
        String s = "H praxi einai: ";
        if (symbol == '\u221A') {//an einai h praxi riza 
            s = "\u221A" + numbers.get(0).toString() + " = " + result;
        } else { //gia oles tis upoloipes praxeis
            //gia na min fainete sto telos to simbolo trexoume ti lista mexri to prwteleutaio stoixeio
            for (int i = 0; i < numbers.size() - 1; i++) {
                s = s + " " + numbers.get(i).toString() + " " + symbol;
            }
            //edw prosthetoume to teleutaio stoixeio sto string
            s = s + numbers.get(numbers.size() - 1).toString();
            //kai epeita to apotelesma tis praxis
            s = s + " = " + result;
        }
        return s;
    }

    //elegxos an to apotelesma einai int
    public boolean isInt() {
        return Math.ceil(result) == Math.floor(result);
    }

    //euresi megistou koinou diaireth
    public int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public boolean isPrime() {
        boolean b = true;
        if (result > 0) {
            for (int i = 2; 2 * i < result; i++) {
                if (result % i == 0) {
                    b = false;
                    return b;
                }
            }
        } else {
            b = false;
            return b;
        }
        return b;
    }

    public int fibonacci() {

        int i = 3;

        int x1 = 1;
        int x2 = 1;
        int sum = 0;
        if (result <= 2) {
            sum = x1;
        }
        while (i <= result) {
            sum = x1 + x2;
            x2 = x1;
            x1 = sum;

            i = i + 1;
        }

        return sum;

    }
//          ME RECURSION
//    public int fibonacci(int n) {
//
//        if (result == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            try {
//                return fibonacci(n - 1) + fibonacci(n - 2);
//            } catch (StackOverflowError e) {
//                System.out.println("Too small memory");
//            }
//
//        }
//        return 0;
//
//    }
}
