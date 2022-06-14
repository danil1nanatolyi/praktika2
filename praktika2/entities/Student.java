package com.example.praktika2.entities;

public class Student extends Human{
    private int idStudent;

//    public Student(){}
    public Student(String name, String surname, String middleName, int idStudent) {
        super(name, surname, middleName);
        this.idStudent = idStudent;
    }

    public int getIdStudent() { return idStudent; }
    public void setIdStudent(int idStudent) { this.idStudent = idStudent; }
}

