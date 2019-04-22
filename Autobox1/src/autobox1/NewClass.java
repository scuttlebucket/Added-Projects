/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox1;

/**
 *
 * @author credu
 */
public class NewClass {
     public static void main(String[] args) {



         Bank bank = new Bank("Bank of Ireland");
         bank.addBranch("Dublin");
         
         bank.addCustomer("Dublin", "Jim", 50.05);
         bank.addCustomer("Dublin", "Mike", 65.00);
         bank.addCustomer("Dublin", "John", 175.00);
         
         bank.addBranch("Galway");
         bank.addCustomer("Galway", "Patrick", 168.50);
         bank.addCustomer("Galway", "Seamus", 180.00);
         
         bank.addCustomerTransaction("Galway", "Patrick",  45.50);
         bank.addCustomerTransaction("Dublin", "Jim",  35.50);
         bank.addCustomerTransaction("Dublin", "John",  80.00);
         
         bank.listCustomers("Dublin", false);
         bank.listCustomers("Galway", true);
         
         bank.addBranch("Cork");
         if(!bank.addCustomer("Cork", "Nathan", 73.50)){
             System.out.println("Error, Cork does not have a branch");
         }
         if(!bank.addBranch("Dublin")){
             System.out.println("Dublin branch already exists");
         }
         
}
    
}
