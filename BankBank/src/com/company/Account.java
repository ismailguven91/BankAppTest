package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
    //CONSTRUCTOR
  /*  public Account(Double Balance){
        customerBalance = Balance;
    }*/

    //CONSTRUCTOR
    public Account(){
        customerAccountNo = UUID.randomUUID();
    }


    //STATE
    private String costumerAccountType = "Debit";
    private Double customerBalance;
    private UUID costumerAccountNo;

    //BEHAVIOUR
    public String getCustomerAccountType() {
        return costumerAccountType;
    }
    public Double getCustomerBalance() {
        return customerBalance;
    }
    public UUID getCustomerAccountNo() {
        return costumerAccountNo;
    }






}






//METHODS AND FUNCTIONS
//TODO: DEPOSIT & WITHDRAW
//TODO: GET ACCOUNT DETAILS (ACCOUNT NO, BALANCE & ACC TYPE)

//TODO: ANVÄND KLASSEN UUID FÖR ATT GENERERA KONTONUMMER
//TODO: KONTOTYP SKA VARA STRING
