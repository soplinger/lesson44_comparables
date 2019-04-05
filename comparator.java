package com.company;

import java.util.Comparator;

public class comparator implements Comparator {


    public int compare(Object first, Object second) {
        int number;
        BankAccount first1 = (BankAccount) first;
        BankAccount second1 = (BankAccount) second;

        if (first1.balance < second1.balance)
            number = -1;
        else
            if (first1.balance >  second1.balance)
                number = 1;
        else
            number = 0;

        return number;
    }
}
