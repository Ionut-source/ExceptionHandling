package ro.java.ctrln;

public class PersonNonStaticInInitializer {

    private int age;
    private String name;

    //bloc ed initializare non-static sau bloc de initializare de instanta
    //acest bloc de cod este chemat in momentul in care se incearca initializarea unui obiect nou
    {
        age = -10;
        name = "John";
        if (age < 0) {
            throw new CtrlNCheckedException("age nu este valid!");
        }
    }

    public PersonNonStaticInInitializer() throws CtrlNCheckedException {
    }

    public PersonNonStaticInInitializer(int age, String name) throws CtrlNCheckedException {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonNonStaticInInitializer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        try {
            PersonNonStaticInInitializer personOne = new PersonNonStaticInInitializer();
            PersonNonStaticInInitializer personTwo = new PersonNonStaticInInitializer(-40,"Mary");
            System.out.println(personOne);
            System.out.println(personTwo);
        } catch (CtrlNCheckedException cnce) {
            System.out.println("Obiectul nu a fost creat corect!");
        }
    }
}