package project2;

public class Addition extends Calculator {

    public Addition() {
    }

    @Override
    public double calc() {
        double sum = 0;
        for (int i = 0; i < super.numbers.size(); i++) {
            sum = sum + Double.parseDouble(numbers.get(i).toString());
        }
        return sum;
    }

}
