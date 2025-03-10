import java.util.*;

public class ATMGenerator {
    static int tot = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ATM Introduction and Greeting
        System.out.println("💳 Welcome to the ATM! 💳");
        System.out.println("🔒 Please insert your ATM card and make sure your transactions are safe!");

        // Menu for ATM options
        while (true) {
            System.out.println("\n📝 Select an option to continue:");
            System.out.println("1️⃣ Deposit (Deposit More than Rs. 500)");
            System.out.println("2️⃣ Withdrawal (Withdraw Minimum Rs. 500)");
            System.out.println("3️⃣ Check Balance");
            System.out.println("4️⃣ Exit");

            System.out.print("\nEnter the number to choose the option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    System.out.println("💵 Your Current Balance is: Rs." + check_balance());
                    break;
                case 4:
                    System.out.println("🔑 Thank you for using our ATM! Stay safe. Goodbye!");
                    return;
                default:
                    System.out.println("❌ Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("💰 Enter the amount to deposit: Rs. ");
        int dep = sc.nextInt();

        // Ensure the deposit is above Rs. 500
        if (dep < 500) {
            System.out.println("🚫 Sorry! You need to deposit more than Rs. 500.");
        } else {
            tot += dep;
            System.out.println("✅ Deposit successful! Your new balance is: Rs." + check_balance());
        }
    }

    public static void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("💵 Enter the amount to withdraw: Rs. ");
        int dep = sc.nextInt();
        int balance = check_balance();

        // Ensure the withdrawal is valid
        if (dep < 500) {
            System.out.println("🚫 The minimum withdrawal amount is Rs. 500.");
        } else if (dep > balance) {
            System.out.println("🚫 Insufficient balance! Your balance is Rs." + balance + ". Please withdraw less.");
        } else {
            tot -= dep;
            System.out.println("✅ Withdrawal successful! Your new balance is: Rs." + check_balance());

            // Ensure balance doesn't go below Rs. 500
            if (tot < 500) {
                System.out.println("⚠️ Warning: Your balance has fallen below Rs. 500. Please maintain a minimum balance.");
            }
        }
    }

    public static int check_balance() {
        return tot;
    }
}
