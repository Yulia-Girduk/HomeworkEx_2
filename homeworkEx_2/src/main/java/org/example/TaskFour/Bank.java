package org.example.TaskFour;

public class Bank extends Thread{

    public static void main(String[] args) {

        BankAccount account_1 = new BankAccount(1,200, "IVAN");
        System.out.println(account_1);
        account_1.refill(100);
        account_1.cashWithdrawal(200);

        BankAccount account_2 = new BankAccount(2,300, "ILYA");
        System.out.println(account_2);
        account_2.refill(50);
        account_2.cashWithdrawal(400);

        BankAccount account_3 = new BankAccount(3,400, "YuLia");
        System.out.println(account_3);
        account_3.refill(250);
        account_3.cashWithdrawal(200);

    }

}
