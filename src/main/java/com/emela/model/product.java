package com.emela.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class product {
    @Id
    private String id;

    @NotBlank(message = "Product name is required")
    private String name;

    @Min(value = 1, message = "Price must be at least 1")
    private double price;

    @NotBlank(message = "Business ID is required")
    private String businessId;
}

