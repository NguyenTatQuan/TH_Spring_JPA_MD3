package org.example.th_spring_jpa_md3.repository;


import org.example.th_spring_jpa_md3.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}
