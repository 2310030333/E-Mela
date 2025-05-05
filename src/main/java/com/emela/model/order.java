package com.emela.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "orders")
public class order {
    @Id
    private String id;

    @NotBlank(message = "User ID is required")
    private String userId;

    @NotBlank(message = "Product ID is required")
    private String productId;

    private LocalDateTime orderDate = LocalDateTime.now();
}
