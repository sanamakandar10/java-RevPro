package com.revature.Bank;

class CurrentAccount extends BankAccount {
    public CurrentAccount(long acc_no, int balance, String holderName) {
        super(acc_no,balance,holderName);
    }

    public CurrentAccount() {
    }

    @Override
    public String toString() {
        return "CurrentAccount{}"+ super.toString();
    }

}
