public class Bankaccount 
{
    static class BankAccount 
    {
        private int balance;
        BankAccount(int balance) 
        {
            this.balance = balance;
        }
        void deposit(int amount) 
        {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        }
        void withdraw(int amount) 
        {
            if (amount <= balance) 
            {
                balance -= amount;
                System.out.println("Withdrawn Amount: " + amount);
            } 
            else 
            {
                System.out.println("Insufficient Balance");
            }
        }
        int getBalance() 
        {
            return balance;
        }
    }
    public static void main(String[] args) 
    {
        BankAccount obj = new BankAccount(5000);
        obj.deposit(4000);
        obj.withdraw(2000);
        System.out.println("Final Balance: " + obj.getBalance());
    }
}
