package com.revature.Bank;

public class demandAccount extends BankAccount {
    public demandAccount(long acc_no, int balance, String holderName) {
        super(acc_no, balance, holderName);
    }

    public demandAccount() {
    }

    @Override
    public String toString() {
        return "demandAccount{}"+ super.toString();
    }
}
