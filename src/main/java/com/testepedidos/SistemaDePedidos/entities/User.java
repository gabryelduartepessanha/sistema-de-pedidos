package com.testepedidos.SistemaDePedidos.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private static final long serialVersionUIS = 1L;
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public User(){

    }

    public <String> User(long id, String name, String email, String phone, String password) {
        this.id = (Long) id;
        this.name = (java.lang.String) name;
        this.email = (java.lang.String) email;
        this.phone = (java.lang.String) phone;
        this.password = (java.lang.String) password;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
