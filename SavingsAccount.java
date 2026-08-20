package MiniBank;

public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolderName,String email,double interestRate){
        super(accountNumber, accountHolderName, email);
        this.interestRate = interestRate;
    }
    public void addInterest(Wallet wallet){
        double interest = wallet.getBalance() * interestRate;
        if(interest > 0){
             System.out.println(" Interest credited : £"+interest);
             wallet.deposit(interest);
        }
    }
    @Override
    public String getAccountType(){
        return " Savings account @"+ (interestRate * 100) + "%";
    }
    @Override
    public String getAccountDetails(){
return super.getAccountDetails()+ "|"+ getAccountType();
    }

}
