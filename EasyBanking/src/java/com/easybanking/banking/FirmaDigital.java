/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easybanking.banking;

import java.util.Calendar;

/**
 *
 * @author Soler
 */
public class FirmaDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person p = new Person("123", "Carlos", "213", "qwdqwd", Calendar.getInstance(), "123");
        Bank easyBank = new Bank(1, "BAC", "Costa Rica", 800800800);
        BankAccount b = new BankAccount("123", 2, 1234, Calendar.getInstance(), Calendar.getInstance());
        System.out.println(""+p.getName() + " BANK "+easyBank.getName());
        
        easyBank.addPersons(p);
        
        try{
        
        for (Person p2: easyBank.getListOfPersons()) {
            
            if (p.equals(null)) {
            
                System.out.println("SII");
                
            }
            
            
        }} catch(NullPointerException e){
        
            System.out.println("MAMON");
        }
        
        easyBank.addPersons(p);
        easyBank.getListOfPersons().add(p);
        
        Person p2 = easyBank.personValidation("123", "213");
        
        if (p2.equals(null)) {
            
            System.out.println("LOL");
        }else{
        
            System.out.println(p2.getName());
        }
        p.getId();
        p.getPassword();
      
        
        System.out.println("" + p.getlistOfBankAccounts());

    }

}
