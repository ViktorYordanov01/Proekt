package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout history = findViewById( R.id.history);
        final LinearLayout geography = findViewById( R.id.geography);
        final LinearLayout culture = findViewById( R.id.culture);
        final LinearLayout sports =findViewById(R.id.sports);

        final Button start = findViewById(R.id.startquiz);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName="История";
                history.setBackgroundResource(R.drawable.round_back_white_stroke);
                geography.setBackgroundResource(R.drawable.round_back_white);
                culture.setBackgroundResource(R.drawable.round_back_white);
                sports.setBackgroundResource(R.drawable.round_back_white);

            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="География";
                geography.setBackgroundResource(R.drawable.round_back_white_stroke);
                history.setBackgroundResource(R.drawable.round_back_white);
                culture.setBackgroundResource(R.drawable.round_back_white);
                sports.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Култура";
                culture.setBackgroundResource(R.drawable.round_back_white_stroke);
                geography.setBackgroundResource(R.drawable.round_back_white);
                history.setBackgroundResource(R.drawable.round_back_white);
                sports.setBackgroundResource(R.drawable.round_back_white);
            }
        });


        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Спорт";
                sports.setBackgroundResource(R.drawable.round_back_white_stroke);
                culture.setBackgroundResource(R.drawable.round_back_white);
                geography.setBackgroundResource(R.drawable.round_back_white);
                history.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Моля изберете област",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });




    }
}