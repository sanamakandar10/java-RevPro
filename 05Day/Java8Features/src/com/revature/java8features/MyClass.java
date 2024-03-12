package com.revature.java8features;

public class MyClass {
    public static void main(String[] args) {
        MyInterface myInterface = (num1, num2, operator) -> {
            //int result;
            if (operator == '+')
                return num1 + num2;
            else if (operator == '-')
                return num1 - num2;
            else if (operator == '*')
                return num1 * num2;
            else
              return Integer.parseInt("Invalid Input");
        };
        System.out.println(myInterface.doOpration(10,20,';'));
    }
}
