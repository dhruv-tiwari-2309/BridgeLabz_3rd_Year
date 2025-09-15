package Java_Class_and_Object.Level_2_Practice_Programs;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public String toString() {
        return "BankAccount [Holder=" + accountHolder + ", AccNo=" + accountNumber + ", Balance=" + balance + "]";
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Lynda", "123456789", 700);
        System.out.println(acc);
        acc.deposit(200);
        System.out.println(acc);
        acc.withdraw(100);
        System.out.println(acc);
        acc.withdraw(900); // insufficient
        System.out.println(acc);
    }
}
