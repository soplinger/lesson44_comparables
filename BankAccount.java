package com.company;

import java.util.Comparator;

public class BankAccount implements Comparable {

    public String name;
    public double balance;

    public BankAccount(String a, double amt) {
        name = a;
        balance = amt;
    }

    public int compareTo(Object o) {
        int number;
        BankAccount temp = (BankAccount) o;
        if (balance < temp.balance)
            number = -1;
        else
            if (balance  > temp.balance)
                number = 1;
        else
            number = 0;

        return number;
    }

    /**  Sorting Alphebetically **/
    /*
    int num;
    BankAccount temp = (BankAccount) o;
    if (name.charAt(0) < temp.name.charAt(0))
        number = -1;
     else
        if (name.charAt(0) > temp.name.charAt(0))
            number = 1;
     else
            number = 0;

         return number;
    */

    public void deposit(double d) {
        balance = balance + d;
    }

    public void withdraw(double w) {
        balance = balance - w;
    }

}
