package com.kit.todo.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;
import jakarta.validation.constraints.Email;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Length(min = 2, max = 64)
    private String name;
    @Email
    @Column(nullable = false, unique = true)
    @Length(min = 4, max = 64)
    private String email;
    @Column(nullable = false)
    @Length(min = 8, max = 64)
    private String password;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ToDo> toDos;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Category> categories;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public void setToDos(List<ToDo> toDos) {
        this.toDos = toDos;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
