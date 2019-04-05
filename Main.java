package com.company;

import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        ArrayList aryList = new ArrayList();
        ArrayList<BankAccount> myAry = new ArrayList();
        String name;
        ListIterator it = aryList.listIterator();
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(2);
        format.setMaximumFractionDigits(2);

        do {
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Enter the Account Holder's Name");
            name = kbInput.nextLine();
            if (!name.equalsIgnoreCase("EXIT")) {
                System.out.println("Enter the amount you would like to deposit: ");
                double amt = kbInput.nextDouble();

                BankAccount acc = new BankAccount(name, amt);
                it.add(acc);
                myAry.add(acc);
            }
        }

        while (!name.equalsIgnoreCase("EXIT"));
        BankAccount acc2 = (BankAccount) it.previous();
        double bal = acc2.balance;
        String name2 = acc2.name;

        while (it.hasPrevious()) {
            acc2 = (BankAccount) it.previous();
            if (acc2.balance > bal) {
                bal = acc2.balance;
                name2 = acc2.name;
            }
        }

        System.out.println("The largest balance account belongs to " + name2);
        System.out.println("Their total is $" +  format.format(bal));

        /** Comparator **/

        /*
        BankAccount[] myLst =  new BankAccount[myAry.size()];
        myLst = myAry.toArray(myLst);
        Comparator comp = new Comparable();
        Arrays.sort(myLst, comp);
        for(BankAccount b : myLst)
        {
            System.out.println("\n" + b.name + " --> " + b.balance);
        }
        */

        /** Comparable **/

        /*
        Collections.sort(myAry);
        for(BankAccount b : myAry)
        {
            System.out.println("\n" + b.name + " >>> " + b.balance);
        }
        */

    }



}
