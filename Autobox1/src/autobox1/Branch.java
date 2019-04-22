package autobox1;



import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edito
/**
 *
 * @author credu
 */
public class Branch {
    private String name;
    private ArrayList<Customer>customers;
    
    public Branch(String name){
    this.name = name;
    this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public boolean newCustomer(String customerName, double initialAmount){
    if(findCustomer(customerName)== null){
       this.customers.add(new Customer(customerName, initialAmount));
       return true;
     }
       return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
       Customer existingCustomer = findCustomer(customerName);
       if(existingCustomer != null){
       existingCustomer.addTransaction(amount);
        return true;
       }
        return false;
     }
    private Customer findCustomer(String customerName){
      for(int i=0;i<this.customers.size(); i++){
      Customer checkedCustomer = this.customers.get(i);
      if (checkedCustomer.getName().equals(customerName)){
      return checkedCustomer;
      }
      }
      return null;
     }

     }
