package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> costumerAccounts = new ArrayList<>();
        List<Costumer> Costumers = new ArrayList<>();

        //BANK NAME
        Bank bank1 = new Bank("Bank Of Sweden");

        //COSTUMERS OF THE BANK
        Costumer costumer1 = new Costumer("Zlatan", "Ibrahimovic", 8110031111L);
        Costumer costumer2 = new Costumer("Ismail", "Güven", 9102212222L);
        Costumer costumer3 = new Costumer("Maria", "Güven", 8701213333L);
        Costumer costumer4 = new Costumer("Elon", "Musk", 7106284444L);
        Costumer costumer5 = new Costumer("Lionel", "Messi", 8706245555L);
        Costumer costumer6 = new Costumer("Kylian", "Mbappe", 9812206666L);
        Costumer costumer7 = new Costumer("Cristiano", "Ronaldo", 8502057777L);
        Costumer costumer8 = new Costumer("Carl", "Gustaf", 4604308888L);
        Costumer costumer9 = new Costumer("Beyonce", "Knowles-Carter", 8109049999L);
        Costumer costumer10 = new Costumer("Shawn", "Carter", 6912041010L);

        //ADD COSTUMERS TO THE BANK
        Costumers.add(costumer1);
        Costumers.add(costumer2);
        Costumers.add(costumer3);
        Costumers.add(costumer4);
        Costumers.add(costumer5);
        Costumers.add(costumer6);
        Costumers.add(costumer7);
        Costumers.add(costumer8);
        Costumers.add(costumer9);
        Costumers.add(costumer10);

        var costumerNames = bank1.getCostumerFirstNames();

        System.out.println(bank1.getNameOfBank());
        System.out.println();


        }


 }

