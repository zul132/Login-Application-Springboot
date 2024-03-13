package com.fathimazulaikha.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Login {
    @Id
    private String username;
    private String password;
    public Login() {
        
    }
    public Login(String Username, String Password) {
        this.username = Username;
        this.password = Password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String Username) {
        this.username = Username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String Password) {
        this.password = Password;
    }
    
}
