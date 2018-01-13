package com.mycompany.interfaces;

import com.mycompany.model.Category;

import java.util.List;

/**
 * Created by HP on 2018-01-13.
 */
public interface CategoryService {

    List<Category> getAllCategory();
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(Category category);
}
