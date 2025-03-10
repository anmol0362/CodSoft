//This Is Java Programming Task 2
//Calculator.java

import java.util.*;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        // Introduction and friendly greeting
        System.out.println("🎓 Welcome to the Grade Calculator! 🎓");
        System.out.println("Please enter your marks for the following 5 subjects to see your final grade.");
        
        // Collect marks for 5 subjects
        System.out.print("📚 Enter the mark for Subject 1: ");
        int S1 = n.nextInt();
        System.out.print("📚 Enter the mark for Subject 2: ");
        int S2 = n.nextInt();
        System.out.print("📚 Enter the mark for Subject 3: ");
        int S3 = n.nextInt();
        System.out.print("📚 Enter the mark for Subject 4: ");
        int S4 = n.nextInt();
        System.out.print("📚 Enter the mark for Subject 5: ");
        int S5 = n.nextInt();

        // Calculate total and average
        int total = S1 + S2 + S3 + S4 + S5;
        int avg = total / 5;

        // Display the average and give feedback
        System.out.println("\n🎯 Your average score is: " + avg);

        // Provide feedback based on the average
        if (avg >= 90) {
            System.out.println("🎉 Grade A - Excellent! You're a star! 🌟");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("👏 Grade B - Great job! Keep up the hard work! 💪");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("👍 Grade C - Good effort! A little more focus, and you'll be even better! 📈");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("👊 Grade D - You can do it! Let's work harder next time! 🚀");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("⚠️ Grade E - Don't worry! You can definitely improve with some more effort! 💡");
        } else {
            System.out.println("😞 Grade F - Keep trying, you're capable of more! Let's work on it together! 💪");
        }

        // Closing message
        System.out.println("\nThank you for using the Grade Calculator! Keep striving for greatness! 🎯");

        // Close the scanner object
        n.close();
    }
}
