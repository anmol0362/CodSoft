//This is Java Programming Task 1
//NumberGame limits upto 1-99

import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(100), b = 1, s = 0;
        System.out.println("🎉 Welcome to the Ultimate Number Game! 🎉");
        System.out.println("A random number has been generated between 0 and 99. Your goal is to guess it within 5 tries!");
        
        while (b <= 5) {
            System.out.print("🤔 Guess the number: ");
            int c = k.nextInt();
            
            if (c > a) {
                System.out.println("🚨 Too high! Try a smaller number.");
                s++;
            } else if (c < a) {
                System.out.println("🚨 Too low! Try a larger number.");
                s++;
            } else {
                System.out.println("🎉 Success! You guessed it right! Congratulations! 🎉");
                break;
            }
            b++;
        }

        int f = 5 - s;
        
        if (s == 5) {
            System.out.println("😢 Oops! You couldn't guess it within 5 tries. Better luck next time!");
        } else {
            System.out.println("🏆 Congratulations! You won the game! You are a true master! 🏆");
            System.out.println("Your final score is: " + f + "/5");
        }
        
        System.out.println("The random number was: " + a);
        System.out.println("Thanks for playing! 🎮 Would you like to try again?");
    }
}
