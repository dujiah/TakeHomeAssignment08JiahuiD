package com.example.du.takehomeassignment08_jiahuid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionAdapter(questions, this));

    }

    private void initialData() {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.term_toast_a, R.string.question_a, R.drawable.a));
        questions.add(new Question(R.string.term_toast_b, R.string.question_b, R.drawable.b));
        questions.add(new Question(R.string.term_toast_c, R.string.question_c, R.drawable.c));
        questions.add(new Question(R.string.term_toast_d, R.string.question_d, R.drawable.d));
        questions.add(new Question(R.string.term_toast_e, R.string.question_e, R.drawable.e));

    }
}
