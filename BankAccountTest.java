public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();

        myBankAccount.depositToChecking(500.00);
        myBankAccount.depositToSaving(1000);
        myBankAccount.displayTotalBalance();
        myBankAccount.withdrawChecking(100);
        myBankAccount.displayTotalBalance();

    }
}
