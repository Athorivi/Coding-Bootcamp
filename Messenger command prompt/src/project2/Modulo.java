package project2;

public class Modulo extends Calculator {

    @Override
    //upologismos tou modulo se panw apo dio arithmous isxei : a % b % c % d .... 
    public double calc() {
        double upoloipo = Double.parseDouble(numbers.get(0).toString());
        for (int i = 1; i < numbers.size(); i++) {
            upoloipo = upoloipo % Double.parseDouble(numbers.get(i).toString());
        }
        return upoloipo;
    }

}
