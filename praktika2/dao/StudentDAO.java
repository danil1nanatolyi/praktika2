package com.example.praktika2.dao;

import com.example.praktika2.entities.Student;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StudentDAO {
    private DatabaseReference databaseReference;
    public StudentDAO(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Student.class.getSimpleName());
    }

    public void addStudent(Student student){
        databaseReference.push().setValue(student);
    }
}
