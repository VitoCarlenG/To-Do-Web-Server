package com.kit.todo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kit.todo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
