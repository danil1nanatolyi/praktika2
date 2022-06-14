package com.example.praktika2.entities;

public abstract class Human {
    private String name;
    private String surname;
    private String middleName;

    public Human(){}
    public Human(String surname, String name, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public String getName() {return name;}
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
}
