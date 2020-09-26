package tw.dworker;

public class Stufunction {
    String name;
    float english;
    float math;
    float chinese;

    public Stufunction() {
    }

    public Stufunction(String name, float english, float math, float chinese) {
        this.name = name;
        this.english = english;
        this.math = math;
        this.chinese = chinese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    public float getAverage(){
        return ((english + math + chinese) / 3);
    }


}
