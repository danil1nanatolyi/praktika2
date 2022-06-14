package com.example.praktika2.entities;

public class Teacher extends Human{
    private String category;

    public Teacher(String name, String surname, String middleName, Category category){
        super(name, surname, middleName);
        this.category = category.name();
    }

    public String getCategory() { return category; }
}
