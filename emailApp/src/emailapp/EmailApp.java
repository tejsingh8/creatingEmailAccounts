/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Scenario: You are an IT Support Administrator and are charged with the task of creating email accounts for new hires.
//
package emailapp;

/**
 *
 * @author 15865
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Email user1 = new Email("tej", "singh");
        System.out.println(user1.showInfo());
    }
    
}
