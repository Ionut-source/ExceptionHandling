package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingOneCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie un imput de la tastatura: ");
        int counter = 0;

        while (scanner.hasNext() && counter < 10) {
            try {
                System.out.println("Numarul " + counter + " citit este: " + scanner.nextDouble());
                System.out.println("Scrie un imput de la tastatura: ");
                counter++;
            } catch (InputMismatchException ime ) {
                System.out.println("Imputul de la tastatura este invalid!");
                scanner.next();
            }
        }
        System.out.println("Thread-ul main se incheie!");
    }
}