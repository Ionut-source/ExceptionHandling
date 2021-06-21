package ro.java.ctrln;

public class ExceptionHandlingUnchecked {

    public static void main(String[] args) {
        try {
            recover(3);
            recover(-100);
        } catch (CtrlNUncheckedException cnue) {
            System.out.println("Valoarea transmisa trebuie sa fie >=0!");
    }
}

    public static void recover(int a) throws CtrlNUncheckedException { //nu este obligatoriu sa definim cu throws exceptia unchecked
        if (a < 0) {
            throw  new CtrlNUncheckedException("a tebuie sa fie >=");
        }
        System.out.println("Valoarea este: " + a);
    }
}
