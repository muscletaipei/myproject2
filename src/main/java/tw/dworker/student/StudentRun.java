package tw.dworker.student;


import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        userInput();


    }

    public static void userInput() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scn.nextLine();
        System.out.printf("Hi %s " + "\n", name );
        System.out.print("Please enter your english score: ");
        int english = scn.nextInt();
        System.out.print("Please enter your math score: ");
        int math = scn.nextInt();
        System.out.print("Please enter your chinese score: ");
        int chinese = scn.nextInt();

        Student stu = new Student(name, english, math, chinese);
        stu.print();

        if (english > math){
            if (english > chinese){
                System.out.printf("The highest score is English %d%n", english);
            }else{
                System.out.printf("The highest score is Chinese %d%n", chinese);
            }
        }else {
            if (math > chinese){
                System.out.printf("The highest score is Math %d%n", math);
            }else {
                System.out.printf("The highest score is Chinese %d%n", chinese);
            }
        }
        System.out.println("--------------------------------------");
        stu.grading();

        scn.close();
    }
}
