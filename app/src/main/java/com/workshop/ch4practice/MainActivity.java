package com.workshop.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"ISM was founded in 1926?", "ISM stands for INDIAN SCHOOL OF MEMES?", "ISM is now an IIT?", "ISM was converted into IIT in 2015?", "ISM is an Institute of National Importance?"};
    private boolean[] answers = {true,false,true,false,true};
    private int score=0;
    private int index=0;

    TextView ques;
    TextView sc;
    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        ques=findViewById(R.id.textView);
        sc=findViewById(R.id.sc);
        sc.setText("SCORE: 0");

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(index<=questions.length-1) {
                boolean res = true;
                {
                    if (answers[index] == res)
                        score = score + 4;
                    else
                        score--;
                }
                index++;
                if (index <= questions.length - 1) {
                    ques.setText(questions[index]);
                } else {
                    Toast.makeText(MainActivity.this, "your Score is " + score, Toast.LENGTH_SHORT).show();
                }
                sc.setText("Your Score is "+score);
            }
            else{sc.setText("QUIZ OVER, YOUR TOTAL SCORE IS "+score+"/"+questions.length*4);}}
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(index<=questions.length-1) {
                boolean res = false;
                {
                    if (answers[index] == res)
                        score = score + 4;
                    else
                        score--;
                }
                index++;
                if (index <= questions.length - 1) {
                    ques.setText(questions[index]);
                } else {
                    Toast.makeText(MainActivity.this, "your Score is " + score, Toast.LENGTH_SHORT).show();
                }
                sc.setText("Your Score is "+score);
            }
            else{sc.setText("QUIZ OVER, YOUR TOTAL SCORE IS "+score+"/"+questions.length*4);}}
        });
    }
}