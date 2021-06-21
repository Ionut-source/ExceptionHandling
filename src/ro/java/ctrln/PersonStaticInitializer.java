package ro.java.ctrln;

public class PersonStaticInitializer {

    private static int age;
    private static int [] vector;

    //un bloc de initializare static este executat de masina virtuala Java,
    //indiferent daca creem obiecte noi din clasa corespunzatoare
    static {
        vector = new int[10];
        vector[0] = 10;
        vector[1] = 11;
        age = 11;
        //putem sa aruncam exceptii unchecked --> adica exceptii aruncate la Runtime de catre JVM
        if (age % 2 == 0) {
            throw new CtrlNUncheckedException("Age nu are o valoare valida!");
        }

        //eroare de compilare daca aruncam exceptii checked --> adica exceptii verificate de catre compilator
        //daca vrem sa aruncam astfel de exceptii trebuie sa le tratam in blocuri try-catch
        try {
            if (age == 10) {
                throw new CtrlNCheckedException("");
            }
        }catch (CtrlNCheckedException cnce) {
            System.out.println("Exceptie la initializarea age!");
        }
    }

    public static void main(String[] args) throws CtrlNCheckedException {
        System.out.println("Rulare program!");
    }
}
