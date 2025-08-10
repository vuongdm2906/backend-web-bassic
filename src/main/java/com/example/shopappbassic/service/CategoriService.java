package com.example.shopappbassic.service;


import com.example.shopappbassic.dto.request.CategoriRequest;
import com.example.shopappbassic.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriService {
    List<CategoryEntity> getAllCategori();
    CategoryEntity addCategori(CategoriRequest categoriRequest);
    void updateCategori (CategoriRequest categoriRequest);
    boolean deleteCategori (CategoriRequest categoriRequest);
}
