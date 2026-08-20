package MiniBank;

public class Main {
    public static void main(String[] args) {
        // create accounts
        Account regularAcc = new Account("101", "Tunde Balogun", "tunde@gmail.com");
        SavingsAccount savingsAcc = new SavingsAccount("202", "Ada Okafor", "ada@gmail.com", 0.05);
        // create wallet for them
        Wallet wallet1 = new Wallet(regularAcc);
        Wallet wallet2 = new Wallet(savingsAcc);

        System.out.println("=== WELCOME TO MINI BANK ===");
        // Deposit money
        wallet1.deposit(20000);
        wallet2.deposit(50000);
        // show info
        System.out.println( "\n---BEFORE TRANSACTIONS ----");
        wallet1.showWalletInfo();
        wallet2.showWalletInfo();
        // TrANSFER
        System.out.println("\n --- TRANSFER #5000 -----");
        wallet1.transfer(wallet2, 5000);
        // ADD INTEREST
        System.out.println("\n ADD INTEREST TO AADA");
        savingsAcc.addInterest(wallet2); // 5% of 5000  
        // Final info
        System.out.println("\n---- FINAL STATE ----");
        wallet1.showWalletInfo();
        wallet1.showTransactionHistory();

        System.out.println();
        wallet2.showWalletInfo();
        wallet2.showTransactionHistory();

        
    }

}
