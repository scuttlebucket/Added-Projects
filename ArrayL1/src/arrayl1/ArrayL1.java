/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayl1;
import java.util.Scanner;

/**
 *
 * @author credu
 */
public class ArrayL1 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0044 354 9157");
 
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action:(6 to show available actions)");
            int action  = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShuting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
        
        
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: Name =" + name + ",Phone = " + phone);
            }else{
            System.out.println("Cannot add," + name + "already on file");
            }
        }
    
    private static void updateContact(){
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
        return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully update record");
        }else {
            System.out.println("Error updating record");
        }
    }
        private static void removeContact(){
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
        return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Sucessfully deleted");
        }else{
            System.out.println("Error deleting contact");
             }
        }
        
        private static void queryContact(){
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
        return;
        }
            System.out.println("Name: "+ existingContactRecord.getPhoneNumber());

        }
    
    
       private static void startPhone(){ System.out.println("Starting phone...");}
    
    private static void printActions(){
        System.out.println("\nAvailable actions:\n press");
        System.out.println("0 - Shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing exists\n" +
                           "6 - to print a list of available actions.");
        System.out.println("Choose your action:");
    }
}
