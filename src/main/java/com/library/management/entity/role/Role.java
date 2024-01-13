package com.library.management.entity.role;
import jakarta.persistence.*;



@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "name", nullable = false)
    private String name;

    // Constructors, getters, and setters

    // Default constructor
    public Role() {
    }

    // Parameterized constructor
    public Role(String name) {
        this.name = name;
    }

    // Getters and setters

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
