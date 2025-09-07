import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Step 2: Input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // validate input
            if (marks < 0 || marks > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; // repeat same subject input
                continue;
            }

            totalMarks += marks;
        }

        // Step 3: Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 4: Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Step 5: Display results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + averagePercentage + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}
