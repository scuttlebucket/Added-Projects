package autobox1;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author credu
 */
public class Customer {
    private String name;
    private ArrayList<Double>transactions;
    
    public Customer(String name, Double initialAmount){
         this.name = name;
         this.transactions = new ArrayList<Double>();
         addTransaction(initialAmount);
         
    }


    public void addTransaction(double amount){
    this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }
        public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
}
