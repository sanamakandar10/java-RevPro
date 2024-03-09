package com.revature.oops;

public class SalariedEmployee extends Employee implements  TaxIncom{
    public SalariedEmployee(int empId, String name, int daysPresent, int basicSalary) {
        super(empId, name, daysPresent, basicSalary);

    }

    public  SalariedEmployee(){

    }

    @Override
    public String toString() {
        return "SalariedEmployee{} " + super.toString();
    }

    public int calculateSalary(int daysPresent,int basicSalary){

        return (daysPresent*basicSalary)+2000;
    }


    @Override
    public void calculateTax() {
        System.out.println("Paying tax.......");
    }
}