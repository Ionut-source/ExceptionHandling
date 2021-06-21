package ro.java.ctrln;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age) throws CtrlNCheckedException, CtrlNUncheckedException {
        if (name == null || name.equals("")) {
            throw new CtrlNCheckedException("Numele trebuie sa aiba o valoare!");
        }
        if (age < 0) {
            throw new CtrlNCheckedException("Varsta trebuie sa fie un numar pozitiv!");
        }
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        throw new UnsupportedOperationException("Numele nu poate fi suprascris!");
    }

    public void setAge(int age) {
        throw new CtrlNUncheckedException("Varsta nu mai poate fi modificata!");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        try {
            Person person = new Person("John", 40);
            Person personOne = new Person("Mary",23);
            System.out.println(person);
            System.out.println(personOne.getAge());
            personOne.setName("Diana");
        } catch (CtrlNCheckedException cnce) {
            System.out.println("Persoana nu a fost creata cum trebuie: " + cnce.getMessage());
        } catch (CtrlNUncheckedException | UnsupportedOperationException exception) {
            System.out.println("Persoanele nu pot fi modificate o data create! -> " + exception.getMessage());
        }
    }
}
