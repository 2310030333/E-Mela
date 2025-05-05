package com.emela.model;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "reviews")
public class review {
    @Id
    private String id;

    @NotBlank(message = "User ID is required")
    private String userId;

    @NotBlank(message = "Business ID is required")
    private String businessId;

    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    private int rating;

    private String comment;
}
