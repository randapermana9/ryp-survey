package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionSixActivity extends AppCompatActivity {

    Button btnNext6;
    Button btnBack6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six);
        btnNext6 = (Button) findViewById(R.id.button11);
        btnBack6 = (Button) findViewById(R.id.back6);

        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionSixActivity.this, QuestionSevenActivity.class));
            }
        });

        btnBack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionSixActivity.this, QuestionFiveActivity.class));
            }
        });
    }
}
