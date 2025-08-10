package com.example.shopappbassic.dto.request;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class CategoriRequest {
    private String name;
    private String description;

}
