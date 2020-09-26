package tw.dworker;

public class Hi {
    public static void main(String[] args) {

        Person person = new Person("Joe", 88f, 1.8f);

        System.out.println();
        System.out.println(person.name + "的BMI是\t" + person.bmi());
        System.out.println();
        person.hello();


    }
}
