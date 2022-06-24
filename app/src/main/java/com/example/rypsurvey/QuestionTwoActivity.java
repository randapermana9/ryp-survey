package com.example.rypsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionTwoActivity extends AppCompatActivity {

    Button btnNext2;
    Button btnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        btnNext2 = (Button) findViewById(R.id.button7);
        btnBack2 = (Button) findViewById(R.id.back2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionTwoActivity.this, QuestionThreeActivity.class));
            }
        });

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionTwoActivity.this, QuestionOneActivity.class));
            }
        });
    }
}
