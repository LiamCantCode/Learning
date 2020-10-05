import java.util.Scanner;

public class Learning {

    public static void main(String[] args) {
        int moneyPayAmount = 0;
        int moneyLoanAmount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to (Loan/Pay): ");
        String moneyUsage = scanner.next().toLowerCase();

                 if (moneyUsage.equals("loan")) {
                System.out.print("Selected money loan");
                System.out.print("\nHow much money would you like to loan (100$-1,000,000$)? ");
                while (true) {
                    moneyLoanAmount = scanner.nextInt();
                    if (moneyLoanAmount >= 100 && moneyLoanAmount <= 1_000_000)
                        break;
                    System.out.print("Please enter a value between 100 and 1,000,000: ");
                }
                System.out.print("Would you like to loan " + moneyLoanAmount + "? ");
                String moneyLoanConfirm = scanner.next().toLowerCase();
                if (moneyLoanConfirm.equals("yes")) {
                    System.out.print(moneyLoanAmount + " would be loaned!");
                } else if (moneyLoanConfirm.equals("no")) {
                    System.out.print("Money would not be loaned.");
                }

            } else {
                if (moneyUsage.equals("pay")) {
                    System.out.print("Selected money pay");
                    System.out.print("\nWho would you like to pay? ");
                    String moneyPayPerson = scanner.next().toLowerCase();
                    System.out.print("Money would be transferred to: " + moneyPayPerson);
                    System.out.print("\nHow much money would you like to transfer to " + moneyPayPerson + " (100$-1,000,000$)? ");
                    while (true) {
                        moneyPayAmount = scanner.nextInt();
                        if (moneyPayAmount >= 100 && moneyPayAmount <= 1_000_000)
                            break;
                        System.out.print("Please enter a value between 100 and 1,000,000: ");
                    }
                    System.out.print("Would you like to transfer " + moneyPayAmount + " to " + moneyPayPerson + "? ");
                    String moneyPayConfirm = scanner.next().toLowerCase();
                    if (moneyPayConfirm.equals("yes")) {
                        System.out.print(moneyPayAmount + " would be transferred to " + moneyPayPerson + "!");
                    } else if (moneyPayConfirm.equals("no")) {
                        System.out.print("Money would not be transferred.");
                    }
                }
            }
        }
    }
