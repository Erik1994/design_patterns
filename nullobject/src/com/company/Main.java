package com.company;

public class Main {

    public static void main(String[] args) {
	    CustomerFactory customerFactory = new CustomerFactory();
        System.out.println(customerFactory.getCustomer("Piruz").getCustomer());
        System.out.println(customerFactory.getCustomer("Ripa").getCustomer());
    }
}
