package com.example.shopappbassic.controller;

import com.example.shopappbassic.dto.request.CategoriRequest;
import com.example.shopappbassic.entity.CategoryEntity;
import com.example.shopappbassic.service.CategoriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CatategoryController {
    private final CategoriService categoriService;

    @GetMapping
    public List<CategoryEntity> getAll() {
        return categoriService.getAllCategori();
    }
    @PostMapping
    public ResponseEntity<CategoryEntity> createCategory(@RequestBody CategoriRequest categoriRequest) {
        return ResponseEntity.ok( categoriService.addCategori(categoriRequest));
    }
}
