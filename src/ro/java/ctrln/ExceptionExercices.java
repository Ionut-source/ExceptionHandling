package ro.java.ctrln;

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

public class ExceptionExercices {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String firstLine = "";
            String secondLine = "";

            firstLine = readNextLine(scanner, firstLine);
            secondLine = readNextLine(scanner, secondLine);

            System.out.println("First line: " + firstLine);
            System.out.println("Second line: " + secondLine);

            int firstNumber = Integer.parseInt(firstLine.trim());
            double secondNumber = Double.parseDouble(secondLine.trim());

            System.out.println("Suma celor doua numere este: " + sum(firstNumber, secondNumber));

        } catch (NumberFormatException nfe) {
            System.out.println("Inputul de la tastatura nu este valid! " + nfe.getMessage());
            nfe.printStackTrace();

        } catch (Throwable throwable) {
            System.out.println("A aparut aceasta exceptie: " + throwable.getMessage());
        }
    }

    public static double sum(Integer firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static String readNextLine(Scanner scanner, String secondLine) {
        if (scanner.hasNext()) {
            secondLine = scanner.nextLine();
            while (secondLine.trim().equals("")) {
                if (scanner.hasNext()) {
                    secondLine = scanner.nextLine();
                }
            }
        }
        return secondLine;
    }

    private static String getString(Scanner scanner, String firstLine) {
        firstLine = readNextLine(scanner, firstLine);
        return firstLine;
    }
}
