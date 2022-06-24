package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionThreeActivity extends AppCompatActivity {

    Button btnNext3;
    Button btnBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
        btnNext3 = (Button) findViewById(R.id.button8);
        btnBack3 = (Button) findViewById(R.id.back3);

        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionThreeActivity.this, QuestionFourActivity.class));
            }
        });

        btnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionThreeActivity.this, QuestionTwoActivity.class));
            }
        });
    }
}
