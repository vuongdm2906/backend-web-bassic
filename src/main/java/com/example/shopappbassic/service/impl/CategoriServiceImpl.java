package com.example.shopappbassic.service.impl;

import com.example.shopappbassic.dto.request.CategoriRequest;
import com.example.shopappbassic.entity.CategoryEntity;
import com.example.shopappbassic.repository.CategoriRepository;
import com.example.shopappbassic.service.CategoriService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriServiceImpl implements CategoriService {
    private final CategoriRepository categoriRepository;

    @Override
    public List<CategoryEntity> getAllCategori() {
        return categoriRepository.findAllCategories();
    }

    @Override
    public CategoryEntity addCategori(CategoriRequest categoriRequest) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(categoriRequest.getName());
        categoryEntity.setDescription(categoriRequest.getDescription());
        return categoriRepository.save(categoryEntity);
    }

    @Override
    public void updateCategori(CategoriRequest categoriRequest) {

    }

    @Override
    public boolean deleteCategori(CategoriRequest categoriRequest) {
        return false;
    }
}
