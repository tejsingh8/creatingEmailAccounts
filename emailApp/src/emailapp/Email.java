/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author 15865
 */
public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companyName = "thecloudjet";

    //Constructor to receive the first name and last name 
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department - return the department
        this.department = setDepartment();

        //Call a method that returns a random password    
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + password);

        //Combine elements to generate email (firstname.lastname@department.company.com)
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName + ".com";
    }

    //Ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName 
                + "\nDepartment Codes:"
                + "\n1 for Sales "
                + "\n2 for Accounting"
                + "\n3 for Development"
                + "\n0 for none\n");
        System.out.print("Enter Department code:");
        Scanner inputIn = new Scanner(System.in);
        int departmentChoice = inputIn.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Accounting";
        } else if (departmentChoice == 3) {
            return "Development";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567879!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName 
                + "\nCompany Email: " + email 
                + "\nMailbox Capacity: " + mailboxCapacity  + "MB";
           
    }
}
