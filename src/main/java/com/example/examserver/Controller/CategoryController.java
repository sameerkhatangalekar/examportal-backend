package com.example.examserver.Controller;

import com.example.examserver.model.exam.BulkCategoryRequest;
import com.example.examserver.model.exam.Category;
import com.example.examserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:4200/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    //add category
    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category)
    {
       Category category1 =   this.categoryService.addCategory(category);
        return ResponseEntity.ok(category1);
    }

    //add bulk categories service
    @PostMapping("/bulk/")
    public ResponseEntity<?> addQuizzes(@RequestBody BulkCategoryRequest bulkCategoryRequest) {
        return ResponseEntity.ok(this.categoryService.addBulkCategories(bulkCategoryRequest));
    }

    //get Category

    @GetMapping("/{categoryId}")
    public Category  getCategory(@PathVariable("categoryId") Long categoryId)
    {
        return this.categoryService.getCategory(categoryId);
    }

    //get all categories

    @GetMapping("/")
    public ResponseEntity<?> getCategories()
    {
        return ResponseEntity.ok(this.categoryService.getCategories());
    }

    @PutMapping("/")
    public  Category updateCategory(@RequestBody Category category)
    {
        return this.categoryService.updateCategory(category);
    }

    // delete Category
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId)
    {
        this.categoryService.deleteCategory(categoryId);
    }


}
