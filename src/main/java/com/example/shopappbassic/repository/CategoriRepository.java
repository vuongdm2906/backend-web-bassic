package com.example.shopappbassic.repository;

import com.example.shopappbassic.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriRepository extends JpaRepository<CategoryEntity, Long> {
    @Query(value = "select * from categories order by created_at desc ", nativeQuery = true)
    List<CategoryEntity> findAllCategories();
}
