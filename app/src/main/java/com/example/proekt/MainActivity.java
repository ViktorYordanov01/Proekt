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
        final LinearLayout history2 = findViewById(  R.id.history2);

        final Button start = findViewById(R.id.startquiz);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName="history";
                history.setBackgroundResource(R.drawable.round_back_white_stroke);
                geography.setBackgroundResource(R.drawable.round_back_white);
                culture.setBackgroundResource(R.drawable.round_back_white);
                history2.setBackgroundResource(R.drawable.round_back_white);

            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="geography";
                geography.setBackgroundResource(R.drawable.round_back_white_stroke);
                history.setBackgroundResource(R.drawable.round_back_white);
                culture.setBackgroundResource(R.drawable.round_back_white);
                history2.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="culture";
                culture.setBackgroundResource(R.drawable.round_back_white_stroke);
                geography.setBackgroundResource(R.drawable.round_back_white);
                history.setBackgroundResource(R.drawable.round_back_white);
                history2.setBackgroundResource(R.drawable.round_back_white);
            }
        });


        history2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="history2";
                history2.setBackgroundResource(R.drawable.round_back_white_stroke);
                culture.setBackgroundResource(R.drawable.round_back_white);
                geography.setBackgroundResource(R.drawable.round_back_white);
                history.setBackgroundResource(R.drawable.round_back_white);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please slelect the Topic",Toast.LENGTH_SHORT).show();
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