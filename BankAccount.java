import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    public static int accountAmount;
    public static double totalMoneyInBank;
    private String accountNumber;

    public BankAccount() {
        accountAmount++;
        this.accountNumber = randomAccountNumber();
    }

    private Integer getRandomRange() {
        Random randomNumber = new Random();
        int ranValue = randomNumber.nextInt(9);
        return ranValue;
    }

    private String randomAccountNumber() {
        String randomNumber = "";
        for (int i = 0; i < 10; i++) {
            randomNumber += getRandomRange().toString();
        }
        return randomNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }

    public void depositToChecking(double money) {
        checkingBalance += money;
        totalMoneyInBank += money;
    }

    public void depositToSaving(double money) {
        savingBalance += money;
        totalMoneyInBank += money;

    }

    public void withdrawChecking(double moneyToWithdraw) {
        if (checkingBalance < moneyToWithdraw) {
            System.out.println("You not have enough money to withdraw in Checking Account");
        } else {
            checkingBalance -= moneyToWithdraw;
            totalMoneyInBank -= moneyToWithdraw;
            System.out.println("Successful Withdrawal");
        }
    }

    public void withdrawSaving(double moneyToWithdraw) {
        if (savingBalance < moneyToWithdraw) {
            System.out.println("You not have enough money to withdraw in Saving Account");
        } else {
            savingBalance -= moneyToWithdraw;
            totalMoneyInBank -= moneyToWithdraw;
            System.out.println("Successful Withdrawal");
        }
    }

    public static double getTotalmoneyInBank() {
        return totalMoneyInBank;
    }

    public void displayTotalBalance() {
        double checkingTotal = getCheckingBalance();
        double savingTotal = getSavingBalance();
        System.out.println("----------------You Acoount------------------");
        System.out.println("Your account Number: " + this.accountNumber);
        System.out.println("Your Checking Balance: " + this.checkingBalance);
        System.out.println("Your Saving Balance: " + this.savingBalance);
        System.out.println("Total Balance: " + (checkingTotal + savingTotal));
    }

}