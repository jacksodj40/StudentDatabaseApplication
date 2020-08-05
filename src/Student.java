import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private static String studentID;
    private String courses = null;
    private double tuitionBalance = 0;
    private static double costOfCourse = 600;
    private static int id = 1000;

    //Constructor to prompt user to enter student's name and year

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior ");
        System.out.print("Enter student grade year: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }


    //Generate unique ID
    private void setStudentID(){
        id++;
        this.studentID =  gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        //Get in a loop, user hits Q when done
        do{
        System.out.print("Enter course to enroll (Q to quit): " +
                "\n History 101\n Mathematics 101\n English 101\n Chemistry 101\n Computer Science 101");

        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (!course.equals("Q")) {
            if (courses == null) {
                courses = "";
            }
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        } else {
            System.out.println("BREAK!");
            break;
        }
    }while(1 != 0);



    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //Pay Tuition
    public void payTuition(){

        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show Status (Print)
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
