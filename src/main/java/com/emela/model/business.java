package com.emela.model;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "businesses")
public class business {
    @Id
    private String id;

    @NotBlank(message = "Business name is required")
    private String name;

    @NotBlank(message = "Category is required")
    private String category;

    private String description;

    @NotBlank(message = "Owner ID is required")
    private String ownerId;
}

