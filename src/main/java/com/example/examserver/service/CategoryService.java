package com.example.examserver.service;

import com.example.examserver.model.exam.BulkCategoryRequest;
import com.example.examserver.model.exam.Category;

import java.util.List;
import java.util.Set;

public interface CategoryService {
    public Category addCategory(Category category);

    public Category updateCategory(Category category);

    public Set<Category> getCategories();

    public Category getCategory(Long categoryId);

    public void deleteCategory(Long categoryId);

    public List<Category> addBulkCategories(BulkCategoryRequest bulkCategoryRequest);
}
