package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFiveActivity extends AppCompatActivity {

    Button btnNext5;
    Button btnBack5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);
        btnNext5 = (Button) findViewById(R.id.button10);
        btnBack5 = (Button) findViewById(R.id.back5);

        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionFiveActivity.this, QuestionSixActivity.class));
            }
        });

        btnBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionFiveActivity.this, QuestionFourActivity.class));
            }
        });
    }
}
