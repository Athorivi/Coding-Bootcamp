package project2;

public class Multiplication extends Calculator {
    
    @Override
    //pollaplasiamos
    public double calc() {
        double product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            product = product * Double.parseDouble(numbers.get(i).toString());
        }
        return product;
    }

}
