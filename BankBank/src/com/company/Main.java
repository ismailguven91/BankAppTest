package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> costumerAccounts = new ArrayList<>();

        Bank b1 = new Bank();
        //ADD CUSTOMERS
        b1.addCustomer(new Customer("Zlatan Ibrahimovic", 8110031111L));
        b1.addCustomer(new Customer("Ismail Güven",  9102212222L));
        b1.addCustomer(new Customer("Maria Güven",  8701213333L));
        b1.addCustomer(new Customer("Elon Musk",  7106284444L));

        //ADD ACCOUNTS
        b1.addAccount(8110031111L);
        b1.addAccount(8110031111L);
        b1.addAccount(9102212222L);
        b1.addAccount(9102212222L);
        b1.addAccount(9102212222L);
        b1.addAccount(8701213333L);
        b1.addAccount(7106284444L);

        //STORE CUSTOMERS
        var  customerInfo1= b1.GetCustomer(8110031111L);
        System.out.println(customerInfo1.get(0));
        System.out.println(customerInfo1.get(1));
        System.out.println(customerInfo1.get(2));
        System.out.println("*******************************************************");


        var customerInfo2 = b1.GetCustomer(9102212222L);
        System.out.println(customerInfo2.get(0));
        System.out.println(customerInfo2.get(1));
        System.out.println(customerInfo2.get(2));
        System.out.println("*******************************************************");


        var customerInfo3 = b1.GetCustomer(8701213333L);
        System.out.println(customerInfo3.get(0));
        System.out.println(customerInfo3.get(1));
        System.out.println(customerInfo3.get(2));
        System.out.println("*******************************************************");

        var customerInfo4 = b1.GetCustomer(7106284444L);
        System.out.println(customerInfo4.get(0));
        System.out.println(customerInfo4.get(1));
        System.out.println(customerInfo4.get(2));
        System.out.println("*******************************************************");









    }


}
