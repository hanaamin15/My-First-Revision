import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int assigmentTotal =40;
        int finalExamTotal = 200;
        int assigmentGrade;
        int finalExamGrade;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter assigment grade: ");
        assigmentGrade = input.nextInt();
        System.out.print("Enter finalExam grade: ");
        finalExamGrade = input.nextInt();

        int Studentgrade = assigmentGrade + finalExamGrade;
        float percent = (float) Studentgrade / finalExamGrade *100;
        System.out.println("Your Grade is :"+Studentgrade);
        System.out.println("percentage is :"+percent);
    }
}
