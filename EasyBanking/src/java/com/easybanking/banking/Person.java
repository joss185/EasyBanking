/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easybanking.banking;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Soler
 */
public class Person {

    private String id;
    private String name;
    private String password;
    private String direction;
    private Calendar birthDate;
    private int phone;
    private ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>();

    ;

    public Person() {
    }

    public Person(String id, String name, String password, String direction, Calendar birthDate, int phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.direction = direction;
        this.birthDate = birthDate;
        this.phone = phone;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ArrayList<BankAccount> getlistOfBankAccounts() {
        return listOfBankAccounts;
    }

    public void setListOfAccounts(ArrayList<BankAccount> listOfBankAccounts) {
        this.listOfBankAccounts = listOfBankAccounts;
    }

    public String getResponsible(Person p) {

        String responsible = "";

        if (p instanceof Legal) {

            responsible = ((Legal) p).getResponsible();

        } else {

            responsible = "-----";
        }

        return responsible;
    }

    public String printAccounts() {

        String returnable = "";

        for (BankAccount i : listOfBankAccounts) {
            returnable += i.toString();

        }

        return returnable;
    }

    @Override
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

        StringBuffer sb = new StringBuffer();
        
        sb.append("EASY BANK! \n");
        sb.append("Cedula: " + this.getId() + "\n");
        sb.append("Nombre: " + this.getName() + "         Telefono: " + this.getPhone() + "\n");
        sb.append("Dirección: " + this.getDirection() + "          Fecha Nacimiento: " + sdf.format(this.getBirthDate().getTime()) + "\n");
        sb.append("Responsable: " + this.getResponsible(this) + "\n");
        sb.append("------------------------------------------------------------------------ \n");
        sb.append("-------------------------- Cuentas Bancarias --------------------------- \n");
        sb.append("------------------------------------------------------------------------ \n");
        sb.append(this.printAccounts());
        sb.append("----------------------------------------------------------------------- \n");

        return sb.toString();
    }

}
