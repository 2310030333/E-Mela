package com.emela.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "payments")
public class payment {
    @Id
    private String id;

    @NotBlank(message = "Order ID is required")
    private String orderId;

    @Positive(message = "Amount must be positive")
    private double amount;

    private String status = "Pending";  // Default status
}

