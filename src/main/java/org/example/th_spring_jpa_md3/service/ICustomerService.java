package org.example.th_spring_jpa_md3.service;


import org.example.th_spring_jpa_md3.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
