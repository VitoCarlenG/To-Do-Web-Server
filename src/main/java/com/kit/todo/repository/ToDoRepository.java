package com.kit.todo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kit.todo.entity.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
