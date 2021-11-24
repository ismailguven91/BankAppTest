package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {

    //CONSTRUCTOR
    public Customer(String Name, Long personalNo){
        customerName = Name;
        customerPersonalNo = personalNo;
        customerAccounts=new ArrayList<>();
    }

    //STATE
    private String customerName;
    private long customerPersonalNo;
    private List<Account> customerAccounts;

    //BEHAVIOUR
    public void addAccount(Account account){
        customerAccounts.add(account);
    }
    public String getCustomerName() {
        return customerName;
    }
    public long getCostumerPersonalNo() {
        return customerPersonalNo;
    }
    public List<Account> getCostumerAccounts() {
        return customerAccounts;
    }



    @Override
    public String toString() {
        return "Costumer{" +
                "costumerName='" + customerName + '\'' +
                ", costumerPersonalNo=" + customerPersonalNo +
                '}';
    }


}





//METHODS AND FUNCTIONS
//TODO: GET INFO OF COSTUMER (NAME,PERSONAL NO & INFO ABOUT COSTUMER ACCOUNTS)
//TODO: CHANGE INFO OF COSTUMER (NAME AND PERSONAL NO)
//TODO: SHOW LIST OF COSTUMER ACCOUNTS
//TODO: