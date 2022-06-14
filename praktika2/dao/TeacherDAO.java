package com.example.praktika2.dao;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.praktika2.entities.Student;
import com.example.praktika2.entities.Teacher;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TeacherDAO {
    private DatabaseReference databaseReference;
    public TeacherDAO(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Teacher.class.getSimpleName());
//        databaseReference = db.getReference().child("Teacher");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                System.out.println("1111111111111111111111111111111111111111111111");
                for(DataSnapshot shot : snapshot.getChildren()){
                    System.out.println(shot.getValue(Teacher.class));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    public void addTeacher(Teacher teacher){ databaseReference.push().setValue(teacher); }

}
