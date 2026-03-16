package gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean canRepeat;

        do {
            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            int grades = 3;
            System.out.println("Enter the " + grades + " grades: ");

            int sum = 0;
            for (int i = 0; i < grades; i++) {
                int grade = scanner.nextInt();
                sum += grade;
            }

            double average = (double) sum / grades;

            int minApprovalAverage = 6;
            if (average >= minApprovalAverage) {
                System.out.println("Approved. Age: " + age);
            } else {
                System.out.println("Failed. Age: " + age);
            }

            System.out.println("Do you want to calculate another grade? (1 = yes, 0 = no)");
            int option = scanner.nextInt();
            canRepeat = option == 1;

        } while (canRepeat);
    }
}
