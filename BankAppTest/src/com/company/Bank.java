package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //STATE
    private String nameOfBank;
    private List<Costumer> Costumers;


    //BEHAVIOUR
    public String getNameOfBank() {
        return nameOfBank;
    }

    public List<Costumer> getCostumers() {
        return Costumers;
    }

    public List<Costumer> GetCustomers(){
        return Costumers;

    }

    public void addCostumer(Costumer c){
        Costumers.add(c);
    }

    public List <String> getCostumerFirstNames(){
        List<String> names = new ArrayList<>();
        for (Costumer costumer: Costumers)
        {
            names.add(costumer.getCostumerFirstName());
        }
        return names;
    }

    //CONSTRUCTOR
    public Bank(String bankName, List<Costumer> costumers){
    Costumers = costumers;
    nameOfBank = bankName;
    }
    public Bank(String bankName){
        nameOfBank = bankName;
    }
}
