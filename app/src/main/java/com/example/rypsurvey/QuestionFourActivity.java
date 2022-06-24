package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFourActivity extends AppCompatActivity {

    Button btnNext4;
    Button btnBack4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
        btnNext4 = (Button) findViewById(R.id.button9);
        btnBack4 = (Button) findViewById(R.id.back4);

        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionFourActivity.this, QuestionFiveActivity.class));
            }
        });

        btnBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionFourActivity.this, QuestionThreeActivity.class));
            }
        });
    }
}