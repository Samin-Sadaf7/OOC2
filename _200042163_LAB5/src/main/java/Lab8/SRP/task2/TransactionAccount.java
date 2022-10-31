package Lab8.SRP.task2;

public class TransactionAccount {
    public void Transfer(Account a, Account b, long amount){
            a.balance=a.balance-amount;
            b.balance=b.balance+amount;
    }
}
