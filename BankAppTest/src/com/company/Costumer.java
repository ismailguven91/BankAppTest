package com.company;

import java.util.List;

public class Costumer {
    //STATE
    private String costumerFirstName;
    private String costumerLastName;
    private Long costumerPersonalNo;
    private List<Account> costumerAccounts;

    //BEHAVIOUR
    public String getCostumerFirstName() {
        return costumerFirstName;
    }

    public String getCostumerLastName() {
        return costumerLastName;
    }

    public Long getCostumerPersonalNo() {
        return costumerPersonalNo;
    }

    public List<Account> getCostumerAccounts() {
        return costumerAccounts;
    }


    //CONSTRUCTOR

    public Costumer(String firstName, String lastName, Long personalNo, List<Account> accounts) {
        costumerFirstName = firstName;
        costumerLastName = lastName;
        costumerPersonalNo = personalNo;
        costumerAccounts = accounts;
    }
    public Costumer(String firstName, String lastName, Long personalNo){
        costumerFirstName = firstName;
        costumerLastName = lastName;
        costumerPersonalNo = personalNo;
    }
}





//METHODS AND FUNCTIONS
//TODO: GET INFO OF COSTUMER (NAME,PERSONAL NO & INFO ABOUT COSTUMER ACCOUNTS)
//TODO: CHANGE INFO OF COSTUMER (NAME AND PERSONAL NO)
//TODO: SHOW LIST OF COSTUMER ACCOUNTS
//TODO:
