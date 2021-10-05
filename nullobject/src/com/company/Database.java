package com.company;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> customerNames;

    public Database() {
        customerNames = new ArrayList<>();
        customerNames.add("Ripa");
        customerNames.add("Erik");
        customerNames.add("Ripka");
    }

    public boolean existCustomer(String name) {
        return customerNames.contains(name);
    }
}
