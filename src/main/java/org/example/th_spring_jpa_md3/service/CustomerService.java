package org.example.th_spring_jpa_md3.service;

import org.example.th_spring_jpa_md3.model.Customer;
import org.example.th_spring_jpa_md3.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }
}
