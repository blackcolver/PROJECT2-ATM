import java.util.*;

class rakesh {
    public static void main(String args[]) {

        // Declare variables
        String name, password = "984868";
        long balance = 0, withdraw, deposit;

        // Create a Scanner class object to get details of the user
        Scanner sc = new Scanner(System.in);

        // Get user's name
        System.out.print("Please Enter Your Name :");
        name = sc.nextLine();

        // Get user's PIN
        System.out.print(" Hello " + name + " Please Enter Your PIN :");
        password = sc.nextLine();

        // Switch based on the entered PIN
        switch (password) {
            case "984868":

                // ATM operations loop
                while (true) {
                    System.out.println("ATM");
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");
                    System.out.println("Choose 3 for Check Balance");
                    System.out.println("Choose 4 for EXIT");
                    System.out.print("Choose the operation you want to perform:");

                    // Get choice from the user
                    int choice = sc.nextInt();

                    // Switch based on the user's choice
                    switch (choice) {
                        case 1:
                            // Withdraw operation
                            System.out.print("Enter money to be withdrawn:");
                            withdraw = sc.nextInt();

                            // Check if the balance is sufficient for withdrawal
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                            } else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;

                        case 2:
                            // Deposit operation
                            System.out.print("Enter money to be deposited:");
                            deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("");
                            break;

                        case 3:
                            // Check balance operation
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            break;

                        case 4:
                            // Exit operation
                            System.out.println("I Hope You Have a Great Day! Thank You For Choosing Us!!");
                            // Exit the program
                            System.exit(0);
                            break;
                    }
                }

            // Display an invalid password message
            default:
                System.out.println("Your Password is Invalid " + name + " Try Again!!");
                System.out.println();
                break;
        }
    }
}
