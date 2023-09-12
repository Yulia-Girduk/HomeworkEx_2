package org.example.TaskFour;

public class BankAccount {
    final int maxBalance = 500;
    final int minBalance = 0;
    int id;
    int balance;
    String owner;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) throws Exception {
        this.balance = balance;
        if (balance < minBalance) throw new InsufficientFundsException("BankAccount");
        if (balance > maxBalance) throw new MaxBalanceExceededException("BankAccount");
    }

    public BankAccount(int id, int balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }
    public void refill(int amount) {
        try {
            setBalance(getBalance()+amount);
            System.out.println("Баланс: " + this.balance);
        } catch (MaxBalanceExceededException e) {
            System.out.println("Балас " + this.balance+" превышает допустимое значение " + maxBalance );
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void cashWithdrawal(int amount) {
        try {
            setBalance(getBalance()-amount);
            System.out.println("Баланс: " + this.balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Не достаточно средств на счету");} catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
