package com.revature.Bank;

public class BankAccountManager {
    public static void main(String[] args) {
        demandAccount da=new demandAccount(123456789L,800000,"Alina");
        CurrentAccount ca=new CurrentAccount(192837465L,500000,"Ave");
        SavingAccount sa=new SavingAccount(987654321L,1000000,"Allen");
        System.out.println(da);
        System.out.println(ca);
        System.out.println(sa);
        sa.getIntrest();
    }
}