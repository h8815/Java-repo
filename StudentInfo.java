import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        int maxIndex = 0, minIndex = 0;
        String name = "Himanshu";
        for (int i = 0; i <= students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1));
            students[i].inputDetails();
        }
        for (int i = 1; i < 3; i++) {
            if (students[i].percentage > students[maxIndex].percentage) {
                maxIndex = i;
            }
            if (students[i].percentage < students[minIndex].percentage) {
                minIndex = i;
            }
        }
        System.out.println("\nStudent Information:");
        for (int i = 0; i < 3; i++) {
            students[i].displayDetails();
        }
        System.out.println("Roll No. " + students[maxIndex].rollNo+" has maximum percentage : "+ students[maxIndex].percentage);
        System.out.println("Roll No: " + students[minIndex].rollNo + " has minimum precentage : "+students[minIndex].percentage);
    }
}
class Student {
    private String name;
    private int[] marks = new int[3];
    int rollNo;
    float percentage;
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        System.out.println("Enter marks for 3 subjects: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int totalMarks = 0;
        for (int i = 0; i < 3; i++) {
            totalMarks += marks[i];
        }
        percentage = (totalMarks / 3.0f);
    }
    
    void displayDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll No: " + rollNo);
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject "+(i+1)+" marks: "+marks[i] + "\n");
        }
        // System.out.println();
        System.out.println("Percentage: " + percentage + "%");
    }
}