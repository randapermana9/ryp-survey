package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionOneActivity extends AppCompatActivity {

    Button btnNext1;
    Button btnBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        btnNext1 =  (Button) findViewById(R.id.button5);
        btnBack1 = (Button) findViewById(R.id.back1);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionOneActivity.this, QuestionTwoActivity.class));
            }
        });

        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionOneActivity.this, StarActivity.class));
            }
        });
    }
}
