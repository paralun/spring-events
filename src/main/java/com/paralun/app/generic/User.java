package com.paralun.app.generic;

public class User {

    private String username;
    private boolean isAdmin;
    private String status;

    public User(String username, boolean isAdmin, String status) {
        this.username = username;
        this.isAdmin = isAdmin;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
