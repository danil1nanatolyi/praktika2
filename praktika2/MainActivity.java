package com.example.praktika2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.praktika2.dao.StudentDAO;
import com.example.praktika2.dao.TeacherDAO;
import com.example.praktika2.entities.Category;
import com.example.praktika2.entities.Student;
import com.example.praktika2.entities.Teacher;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private TeacherDAO teacherDAO = new TeacherDAO();
    private StudentDAO studentDAO = new StudentDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailET = findViewById(R.id.emailET);
        EditText passwordET = findViewById(R.id.passwordET);

        Button loginButton = findViewById(R.id.loginButton);

//        teacherDAO.getTeacher("", "", "");
        loginButton.setOnClickListener(view -> {
            String email = emailET.getText().toString();
            String password = passwordET.getText().toString();

            System.out.println("11111 " + email + "    " + password);
//            Student student = new Student("Иван", "Иванов", "Иванович", 1);
//            studentDAO.addStudent(student);
        });
    }
}