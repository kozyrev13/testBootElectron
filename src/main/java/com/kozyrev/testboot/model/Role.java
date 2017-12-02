package com.kozyrev.testboot.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "USER_ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;

    @Column
    private String role;

    @ManyToOne
    @JoinColumn(name="username")
    private User user;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}