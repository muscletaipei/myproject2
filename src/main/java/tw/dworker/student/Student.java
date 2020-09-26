package tw.dworker.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    int chinese;

    public Student(String name, int english, int math, int chinese) {
        this.name = name;
        this.english = english;
        this.math = math;
        this.chinese = chinese;
    }
    public void print(){
        System.out.println("--------------------------------------");
        System.out.printf("%s's english score is %d%n, math score is %d " +
                "and chinese score is %d %n", name, english, math, chinese);
        System.out.println("--------------------------------------");
//        System.out.println(name + "\t" + english + "\t" + math + "\t" + chinese);
        System.out.printf("%s's average score is %d%n", name, getAverage());
        System.out.println("--------------------------------------");
    }
    public int getAverage(){
        return ((english + math + chinese) / 3);
    }

    public void grading(){
        int average = getAverage();
        char garding = 'F';
        switch (average/10){
            case 10:
            case 9:
                garding = 'A';
                break;
            case 8:
                garding = 'B';
                break;
            case 7:
                garding = 'C';
                break;
            case 6:
                garding = 'D';
                break;
            default: garding = 'F';
        }
        System.out.println("The garding is " + garding + "\t\n" + ((average >= 60) ? "It's PASS" : "It's Fail"));
        System.out.println("--------------------------------------");
    }

}
