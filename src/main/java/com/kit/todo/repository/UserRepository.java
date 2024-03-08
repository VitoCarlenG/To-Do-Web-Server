package com.kit.todo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kit.todo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
