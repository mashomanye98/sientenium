package com.sientenium.demo.model;
public class User {

    private Long userId;
    private String name;
    private String department;
    private String email;
    private String role;
    private String passwordHash;

    public User() {
    }

    public User(Long userId, String name, String department, String email, String role, String passwordHash) {
        this.userId = userId;
        this.name = name;
        this.department = department;
        this.email = email;
        this.role = role;
        this.passwordHash = passwordHash;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
