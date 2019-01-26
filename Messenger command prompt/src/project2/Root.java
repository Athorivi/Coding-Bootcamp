package project2;

public class Root extends Calculator {

    @Override
    //riza
    public double calc() {
        double squareRoot = Math.sqrt(Double.parseDouble(numbers.get(0).toString()));
        return squareRoot;
    }

}
