package com.irinaserova;




public class BankMain {
    public static void main(String[] args) {
        Bank myBankAccount = new Bank(4141,
                100);
        
        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);

    }

}
