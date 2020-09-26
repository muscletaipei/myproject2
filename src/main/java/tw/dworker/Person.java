package tw.dworker;

public class Person {
    String name;
    float weight;
    float hight;

    public Person() {
    }

    public Person(String name, Float weight, Float hight) {
        this.name = name;
        this.weight = weight;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHight() {
        return hight;
    }

    public void setHight(Float hight) {
        this.hight = hight;
    }
    public float bmi(){
        float bmi = weight / (hight * hight);
        return bmi;
    }

    public void hello(){
        System.out.println("This is first JAVA");
    }
}
