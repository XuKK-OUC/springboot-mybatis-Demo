package com.atnewstar.integration.entity;

/**
 * @author Xukaikai
 * @date 2019/11/10 22:11
 */

public class User {
    private int id;
    private String email;
    private String usename;
    private String role;
    private String mobile;

    public User() {
    }

    public User(int id, String email, String usename, String role, String mobile) {
        this.id = id;
        this.email = email;
        this.usename = usename;
        this.role = role;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", usename='" + usename + '\'' +
                ", role='" + role + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
