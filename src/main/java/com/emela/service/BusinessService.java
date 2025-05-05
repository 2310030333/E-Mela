package com.emela.service;

import com.emela.model.business;
import com.emela.repository.BusinessRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {

    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public List<business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    public Optional<business> getBusinessById(String id) {
        return businessRepository.findById(id);
    }

    public business createBusiness(business business) {
        return businessRepository.save(business);
    }

    public void deleteBusiness(String id) {
        businessRepository.deleteById(id);
    }
}
