package com.emela.controller;

import com.emela.model.business;
import com.emela.service.BusinessService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    private final BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping
    public ResponseEntity<List<business>> getAllBusinesses() {
        return ResponseEntity.ok(businessService.getAllBusinesses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<business> getBusinessById(@PathVariable String id) {
        Optional<business> business = businessService.getBusinessById(id);
        return business.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<business> createBusiness(@RequestBody business business) {
        return ResponseEntity.ok(businessService.createBusiness(business));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusiness(@PathVariable String id) {
        businessService.deleteBusiness(id);
        return ResponseEntity.noContent().build();
    }
}
