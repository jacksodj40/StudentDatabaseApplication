import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Ask how many new students we want to add

        System.out.print("How many students are you adding");
        Scanner in = new Scanner (System.in);
        int numberOfStudents = in.nextInt();

        //Create n number of new students
        Student[] students = new Student[numberOfStudents];
        for (int n = 0; n<numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }





    }
}
