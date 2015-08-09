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
public class Manager extends User{
    
    //Can create User Accounts and Clients 
    
    private int extraSalary;

    public Manager(String id, String name, String password, String direction, Calendar birthDate, int phone, int salary, String workShift,int extraSalary) {
        super(id, name, password, direction, birthDate, phone, salary, workShift);
        this.extraSalary = extraSalary;
    }

    public int getExtraSalary() {
        return extraSalary;
    }

    public void setExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }

    @Override
    public String toString() {
        return "Manager{" + "extraSalary=" + extraSalary + '}';
    }
    
    
    
}
