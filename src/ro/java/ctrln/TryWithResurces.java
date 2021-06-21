package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResurces {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in);
            Scanner scannerOne = new Scanner(System.in)) {
            if (scanner.hasNext()) {
                System.out.println("Numarul citit este: " + scanner.nextDouble());
            }
            recover(4);
        }catch (CtrlNCheckedException cnce) {
            System.out.println("a trebuie sa fie >=0");
        }catch (InputMismatchException ime) {
            System.out.println("Inputul citit nu este valid!");
        }
    }

    public static void recover(int a) throws CtrlNCheckedException {
        if (a < 0) {
            throw new CtrlNCheckedException("a tebuie sa fie >=0");
        }
        System.out.println("a este: " + a);
    }
}
