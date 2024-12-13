package com.rahma.studentrecyclerviewapp_2312500735;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Hardcoded student data
        studentList = new ArrayList<>();
        studentList.add(new Student("2312500735", "Kurnia Rahmawati", "rahma@gmail.com", "2004-10-03"));
        studentList.add(new Student("2312500736", "Almira", "miraa@gmail.com", "2004-02-11"));
        studentList.add(new Student("2312500737", "Azizah", "zizah@gmai.com", "2005-12-04"));

        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);


    }
}
