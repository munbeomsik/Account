public class Account {
    private int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int monny) {
        this.balance += monny;
    }

    public int withdraw(int monny) {
        if(this.balance < monny){
            return this.balance;
        }
       return this.balance -= monny;
    }
}
