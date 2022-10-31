package Lab8.SRP.task2;

public class Account {
    public String accountID;
    public long balance;
    public Account(String accountID,long balance){
        this.accountID=accountID;
        this.balance=balance;
    }
    public long GetBalance(){
        return this.balance;
    }
    public void Credit(long amount){
        this.balance=this.balance+amount;
    }
    public void Debit(long amount){
        this.balance=this.balance-amount;
    }

}
