package project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //edw tha kratame ola ta antikeimena tou Calculator
        List<Calculator> calcs = new ArrayList<>();
        //Calculator c = new Calculator();
        int choice;
        Scanner input = new Scanner(System.in);
        //O xristis tha epilexei enan arithmo pou antistoixei sti praxi pou epithimei
        for (int i = 0; i < 2; i++) {
            //Calculator c = new Calculator();
            do {
                System.out.println("Epelexe ti praxi pou theleis na kaneis");
                System.out.println("1. Prosthesi");
                System.out.println("2. Afairesi");
                System.out.println("3. Pollaplasiasmos");
                System.out.println("4. Diairesi");
                System.out.println("5. Modulo (%)");
                System.out.println("6. Tetragwniki Riza (\u221A)");
                while (!input.hasNextInt()) {
                    System.out.println("Not a valid choice");
                    input.next();
                }
                choice = input.nextInt();
            } while (choice < 0 || choice > 6);
            Calculator c = null;
            switch (choice) {
                case 1://prosthesi
                    c = new Addition();
                    c.setSymbol('+'); //thetoume to symbolo tis praxis
                    c.setNumbers(c.readIntNumbers(c.symbol));//diavazoume tous akeraious !!!! oxi mono 2 alla osous thelei o xristis
                    c.setResult(c.calc()); //pragmatopoieitai h prosthesi kai apothikeuetai sto result
                    break;
                case 2://afairesi
                    c = new Subtraction();
                    c.setSymbol('-');
                    c.setNumbers(c.readIntNumbers(c.symbol));
                    c.setResult(c.calc());
                    break;
                case 3://pollaplasiasmos
                    c = new Multiplication();
                    c.setSymbol('*');
                    c.setNumbers(c.readIntNumbers(c.symbol));
                    c.setResult(c.calc());
                    break;
                case 4://diairesi
                    c = new Division();
                    c.setSymbol('/');
                    c.setNumbers(c.readIntNumbers(c.symbol));
                    c.setResult(c.calc());
                    break;
                case 5://modulo(%)
                    c = new Modulo();
                    c.setSymbol('%');
                    c.setNumbers(c.readIntNumbers(c.symbol));
                    c.setResult(c.calc());
                    break;
                case 6://riza !!!! thelei mono ena noumero
                    c = new Root();
                    c.setSymbol('\u221A');
                    c.setNumbers(c.readIntNumbers(c.symbol));
                    c.setResult(c.calc());
                    break;
                default:
                    System.out.println("wrong input");
            }
            System.out.println(c.toString());
            calcs.add(c);
        }

        //GCD prepei kai oi dio arithmoi na einai akeraioi
        if (calcs.get(0).isInt() && calcs.get(1).isInt()) {
            int x = (int) (calcs.get(0).getResult());
            int y = (int) (calcs.get(1).getResult());
            int result = calcs.get(0).gcd(x, y);
            System.out.println("O megistos koinos diairetis tou " + x + " kai " + y + " einai to " + result);
            //an to deutero result einai prwtos arithmos
            boolean b = calcs.get(1).isPrime();
            if (b) {
                System.out.println("O " + y + " einai prwtos arithmos");
            } else {
                System.out.println("O " + y + " DEN einai prwtos arithmos");
            }
            //fibonacci tou 2ou result
            int f = calcs.get(1).fibonacci();
            System.out.println("O fibonacci tou " + y + " einai: " + f);
        } else {
            System.out.println("Den mporoume na vroume an einai prime, h na ginei GCD, h na vroume to Fibonacci giati to apotelesma den einai akeraio!");
        }
    }
}
