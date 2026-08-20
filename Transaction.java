package MiniBank;
import java.time.LocalDate;
public class Transaction {
    private double amount;
    private String type;
    private String note;
    private String date;

    public Transaction(double amount, String type, String note){
        this.amount = amount;
        this.type = type;
        this.note = note;
        this.date = LocalDate.now().toString();
    }
    @Override
    public String toString(){
        return "["+ date + "]"+ type + " : £"+amount+ "|"+note;
    }


}
