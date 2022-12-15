public class Account {

    int account_number;
    int account_balance;

    public void showDate() {
        System.out.println(account_balance);
        System.out.println(account_number);
    }

    public void deposit(int a){
        account_balance -=a;
    }

}
