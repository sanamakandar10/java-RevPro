package com.revature.Bank;

class SavingAccount extends BankAccount {
    public SavingAccount(long acc_no, int balance, String holderName) {
        super(acc_no,balance,holderName);
    }

    public SavingAccount() {
    }

    @Override
    public String toString() {

        return "SavingAccount{}"+ super.toString();
    }

    public void getIntrest()
    {

        System.out.println("Giving Intrest");
    }
}
