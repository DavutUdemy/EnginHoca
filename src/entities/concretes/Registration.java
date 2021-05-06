package entities.concretes;

import entities.abstracts.Entity;

public class Registration implements Entity {
    private String Name;
    private String lastName;
    private String email;
    private String password;

    public Registration() {
    }

    public Registration(String name, String lastName, String email, String password) {
        Name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}

