import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of students");

        int marks[]=new int[6];
        System.out.println("Enter Maths mark");
        marks[0]=sc.nextInt();
        System.out.println("Enter Phys mark");
        marks[1]=sc.nextInt();
        System.out.println("Enter Chem mark");
        marks[2]=sc.nextInt();
        System.out.println("Enter Biology mark");
        marks[3]=sc.nextInt();
        System.out.println("Enter IT mark"+marks[4]);
        marks[4]=sc.nextInt();
        System.out.println("Enter  Hindhi mark"+marks[5]);
        marks[5]=sc.nextInt();
       // Calculate total marks
        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / 6;

        // Calculate grade
        char grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
