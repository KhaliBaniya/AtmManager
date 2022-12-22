package com.conpany.AtmProject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImp implements AtmOperationInterf {
    Atm atm = new Atm();
    Map<Double,String > minismt =new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override

    public void withdrawAmount(double withdrawAmount) {

        if (withdrawAmount<=atm.getBalance()){
            minismt.put(withdrawAmount," Amount Withdrawn ");
            System.out.println("COllect the Cash"+withdrawAmount);
        atm.setBalance(atm.getBalance()-withdrawAmount);
        viewBalance();
        }
        else {
            System.out.println("Insufficant Balance !!");
        }


    }

    @Override
    public void depositAmount(double depositAmount) {
        minismt.put(depositAmount," Amount Deposited ");
        System.out.println(depositAmount+" Deposited Succesfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:minismt.entrySet()){
            System.out.println(m.getKey()+""+ m.getValue());
        }

    }
}
