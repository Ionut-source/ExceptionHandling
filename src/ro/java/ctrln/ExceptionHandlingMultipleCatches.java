package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMultipleCatches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie un imput de la tastatura: ");
        int counter = 0;

        while (scanner.hasNext() && counter < 10) {
            //linii de cod
            try {
                if (counter == 5) {
                    scanner.close();
                }
                System.out.println("Numarul " + counter + " citit este: " + scanner.nextDouble());
                System.out.println("Scrie un imput de la tastatura: ");
                counter++;
            } catch (InputMismatchException ime) {
                System.out.println("Imputul de la tastatura este invalid!");
                scanner.next();
            } catch (IllegalStateException ise) {
                System.out.println("Scanerul este inchis! Nu avem cum sa mai citim numere!");
                break;
            } finally {
                //cod de curatare aditionala
                System.out.println("Acest cod se executa mereu!");
                if (counter == 5) {
                    scanner.close();
                    break;
                }
            }
            //linii de cod
        }

        System.out.println("Thread-ul main se incheie!");
    }
}
