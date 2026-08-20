package MiniBank;

public class Account {
    protected String accountNumber;
    protected String accountHolderName;
    private String email;

    public Account(String accountNumber,String accountHolderName,String email){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.email = email;
    }
    public String getAccountDetails(){
        return "Account : "+ accountNumber +" | Owner:"+accountHolderName;
    }
    public String getAccountType(){
        return "General Account";
    }

}
