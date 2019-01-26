package project2;

public class Division extends Calculator {

    @Override
    //diairesi
    public double calc() {
        double quotient = Double.parseDouble(numbers.get(0).toString());
        for (int i = 1; i < numbers.size(); i++) {
            if (Double.parseDouble(numbers.get(i).toString()) != 0) { //elegxoume an kapoios arithmos einai 0

                quotient = quotient / Double.parseDouble(numbers.get(i).toString());
            } else {
                System.out.println("Den mporei na ginei diaresi me to mhden (0)\n");
                return 0;
            }
        }
        return quotient;
    }
}
