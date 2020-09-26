package tw.dworker;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        userInput();
        StuPerson p = new StuPerson();


    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type your name :");
        String name = scanner.next();
        System.out.print("Please type your english score :");
        float english = scanner.nextFloat();
        System.out.print("Please type your math score :");
        float math = scanner.nextFloat();
        System.out.print("Please type your chinese score :");
        float chinese =scanner.nextFloat();

        Stufunction function = new Stufunction(name, english, math, chinese);
        System.out.println(function.name + "的平均成績為 " + function.getAverage());
    }
}
