package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Scrie un program care sa respecte urmatoarele cerinte: <br/>
 * <ol>
 *     <li>Citeste de la tastatura doua linii diferite</li>
 *     <li>Transforma cele doua linii in doua numere de tip integer si de tip double</li>
 *     <li>Declara o metoda care sa calculeze suma celor doua numere</li>
 *     <li>Afiseaza pe consola suma dintre cele doua numere</li>
 *     <li>Trateaza potentialele exceptii care pot aparea in aplicatie</li>
 * </ol>
 */

public class ExceptionExercicesMe {

    public static void main(String[] args) {

        Integer i = 10;
        double d = 20.0;

        System.out.println(i + d);


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                System.out.println("Numarul afisat este de tip double: " + scanner.nextDouble());
            } catch (InputMismatchException ime) {
                System.out.println("Numarul afisat NU este de tipul double!");
                break;
            }
        }
    }
}
