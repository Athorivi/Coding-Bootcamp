package project2;

public class Subtraction extends Calculator {

    @Override
    //afairesi
    public double calc() {
        double sum = Double.parseDouble(numbers.get(0).toString());
        for (int i = 1; i < numbers.size(); i++) {
            sum = sum - Double.parseDouble(numbers.get(i).toString());
        }
        return sum;
    }

}
