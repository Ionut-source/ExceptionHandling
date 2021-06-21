package ro.java.ctrln;

import java.math.BigDecimal;

public class ExceptionHandlingMultipleExceptionOneCatch {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BigDecimal bigDecimal = new BigDecimal("2.73");

        try {
            System.out.println(vector[7]);
            bigDecimal = null;
            System.out.println(bigDecimal.intValue());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException  | IllegalStateException exception) {
            if (exception instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Nu exista acest index!");
            }
            if (exception instanceof NullPointerException) {
                System.out.println("Obiectul referit este null!");
            }
        } finally { //bloc optional
            System.out.println("Suntem in blocul finaly!");
        }
    }
}
