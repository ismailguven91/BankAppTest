package com.company;

public class Account {
    //STATE
    private String costumerAccountType;
    private Long costumerBalance;
    private Long costumerAccountNo;

    //BEHAVIOUR
    public String getCostumerAccountType() {
        return costumerAccountType;
    }

    public Long getCostumerBalance() {
        return costumerBalance;
    }

    public Long getCostumerAccountNo() {
        return costumerAccountNo;
    }


    //CONSTRUCTOR
    public Account(String accType, Long balance, Long accNo){
        costumerAccountType = accType;
        costumerBalance = balance;
        costumerAccountNo = accNo;
    }
}






//METHODS AND FUNCTIONS
//TODO: DEPOSIT & WITHDRAW
//TODO: GET ACCOUNT DETAILS (ACCOUNT NO, BALANCE & ACC TYPE)
