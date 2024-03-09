package com.revature.Bank;

public class BankAccount {
    private long acc_no;
    private int balance;
    private String holderName;

    public BankAccount() {
    }

    public BankAccount(long acc_no, int balance, String holderName) {
        this.acc_no = acc_no;
        this.balance = balance;
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "acc_no=" + acc_no +
                ", balance=" + balance +
                ", holderName='" + holderName + '\'' +
                '}';
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}