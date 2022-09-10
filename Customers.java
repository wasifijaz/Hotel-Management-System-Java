/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPproject;

import java.util.ArrayList;


/**
 *
 * @author Dell4
 */
public class Customers {

    String Name;
    String Contact;
    String Email;
    String CNIC;
    String Gender;
    String Password;
    
    public Customers(String name, String contact, String email, String cnic, String gender, String password)
    {
        this.Name       = name;
        this.Contact    = contact;
        this.Email      = email;
        this.CNIC       = cnic;
        this.Gender     = gender;
        this.Password   = password;
    }
    
    public Customers(String email, String password)
    {
        this.Email = email;
        this.Password = password;
    }
    
    public String getEmail() {
        return Email;
    }
    public String getPassword() {
        return Password;
    }

    public void print ()
    {
        System.out.println(Name);
        System.out.println(Contact);
        System.out.println(Email);
        System.out.println(CNIC);
        System.out.println(Gender);
    }
    
    String Checkin;
    String Checkout;
    int tPersons;
    
    public Customers(String checkin, String checkout, int tPersons)
    {
        this.Checkin    = checkin;
        this.Checkout   = checkout;
        this.tPersons   = tPersons;
    }
    
    public void printRes ()
    {
        System.out.println(Checkin);
        System.out.println(Checkout);
        System.out.println(tPersons);
    }
    
    public void alistData()
    {
        ArrayList alist = new ArrayList();
        alist.add(Name);
        alist.add(Contact);
        alist.add(Email);
        alist.add(Gender);
        alist.add(Checkin);
        alist.add(Checkout);
        alist.add(tPersons);
    }
}
