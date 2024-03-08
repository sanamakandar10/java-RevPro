/*3. Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions*/
import java.util.Scanner;

class BankAccount {
    private static int accountNumber = 1000;
    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int transactions;
    private String accountNumber;

    public BankAccount(String name, String address, String accountType, double balance) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.transactions = 0;
        this.accountNumber = generateAccountNumber();
    }

    private static String generateAccountNumber() {
        return "BA" + accountNumber++;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Number of Transactions: " + transactions);
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions++;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numDepositers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        BankAccount[] accounts = new BankAccount[numDepositers];

        for (int i = 0; i < numDepositers; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            System.out.print("Enter account type: ");
            String accountType = scanner.nextLine();
            System.out.print("Enter balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            accounts[i] = new BankAccount(name, address, accountType, balance);
        }

        System.out.println("\nInformation of a depositor:");
        accounts[0].displayInfo();

        System.out.println("\nDepositing into account:");
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        accounts[0].deposit(depositAmount);
        System.out.println("Updated information after deposit:");
        accounts[0].displayInfo();

        System.out.println("\nWithdrawing from account:");
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        accounts[0].withdraw(withdrawAmount);
        System.out.println("Updated information after withdrawal:");
        accounts[0].displayInfo();

        System.out.println("\nChanging address:");
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new address: ");
        String newAddress = scanner.nextLine();
        accounts[0].changeAddress(newAddress);
        System.out.println("Updated information after address change:");
        accounts[0].displayInfo();

        for (int i = 1; i < accounts.length; i++) {
            System.out.println("\nRandom operations for account " + (i + 1) + ":");
            accounts[i].deposit(100);
            accounts[i].withdraw(50);
            accounts[i].changeAddress("New City");
            accounts[i].displayInfo();
        }

        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getTransactions();
        }

        System.out.println("\nTotal number of transactions: " + totalTransactions);
    }
}
