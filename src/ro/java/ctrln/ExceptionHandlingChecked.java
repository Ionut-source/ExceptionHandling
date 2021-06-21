package ro.java.ctrln;

public class ExceptionHandlingChecked {

    public static void main(String[] args) {
        // Cand folosesc checked exception sunt obligat (de catre compilator) sa folosesc codul meu de exceptii
        try {
            recover(500);
            recover(-200,"Verifica imput!");
        } catch (CtrlNCheckedException cnce) {
            System.out.println("Trebuie o valoare mai mare sau egala decat 0!");
        }
    }

    public static void recover(int a, String mesage) throws CtrlNCheckedException{
        System.out.println(mesage);
        recover(a);
    }

        public static void recover(int a) throws CtrlNCheckedException {
            if (a < 0) {
                throw new CtrlNCheckedException("a trebuie sa fie >=0 !");
            }
            System.out.println("a este valid: " + a);
        }
    }

