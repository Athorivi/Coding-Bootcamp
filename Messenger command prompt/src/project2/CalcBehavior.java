package project2;

import java.util.ArrayList;
import java.util.Scanner;

public interface CalcBehavior {

    //diavazei toulaxiston 2 akeraious. stamataei me to keno enter
    default ArrayList readIntNumbers(char symbol) {
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Dwse arithmo. Gia na stamathseis pata to enter");
        Scanner input = new Scanner(System.in);
        double answer;
        String s = null;

        //an to symbolo einai h riza tote diavazei mono ena noumero
        if (symbol == '\u221A') {
            try {
                s = input.nextLine();
                answer = Double.parseDouble(s);
                numbers.add(answer);
            } catch (NumberFormatException e) {
                if (s.equals("")) {
                    ;
                } else {
                    System.out.println("Not a number. Please give a number");
                }
            }
            //alliws diavazei osous thelei o xristis
        } else {
            do {
                try {
                    s = input.nextLine();
                    answer = Double.parseDouble(s);
                    numbers.add(answer);
                } catch (NumberFormatException e) {
                    if (s.equals("")) {
                        ;
                    } else {
                        System.out.println("Not a number. Please give a number");
                    }
                    //if (s.equals("") || numbers.size() <= 2) {
                    //   System.out.println("Not a number. Please give a number");
                    //}
                }
            } while (!s.equals("") || numbers.size() < 2);
        }
        return numbers;

    }

}
