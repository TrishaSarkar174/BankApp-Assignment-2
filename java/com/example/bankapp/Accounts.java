package com.example.bankapp;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
    List<String> getAccounts(String accountType){
        List<String> account = new ArrayList<>();

        if(accountType.equals("Current Account"))
        {
            account.add("Trisha Sarkar");
            account.add("Suvro Roy");
        }
        else if(accountType.equals("Savings Account")){
            account.add("Mouni Roy");
            account.add("Suvra Sen");
        }
        else if(accountType.equals("Fix Deposit Account")){
            account.add("Arjun Sarkar");
            account.add("Malati Bala Debi");
        }
        else {
            account.add("Sree Roy");
            account.add("Tonoya Sen");
        }
        return account;
    }
}
