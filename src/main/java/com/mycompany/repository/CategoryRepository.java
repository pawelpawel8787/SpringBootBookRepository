package com.mycompany.repository;

import com.mycompany.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018-01-13.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
