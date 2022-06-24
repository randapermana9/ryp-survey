package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionSevenActivity extends AppCompatActivity {

    Button btnNext7;
    Button btnBack7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_seven);
        btnNext7 = (Button) findViewById(R.id.button12);
        btnBack7 = (Button) findViewById(R.id.back7);

        btnNext7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionSevenActivity.this, SubmitActivity.class));
            }
        });

        btnBack7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionSevenActivity.this, QuestionSixActivity.class));
            }
        });
    }
}
