package Lab8.SRP.task2;

public class OperateAccount {
        public void AddAccount(String accountID,Account A) {

            A = new Account(accountID, 0);
        }
        public void updateAccount(Account A,long balance) {
            A = new Account(A.accountID, balance);
        }
        public void findAccountForUser(Account user,String Account_type){

         }
}
