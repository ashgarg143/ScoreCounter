package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreA,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayforA(scoreA);
        displayforB(scoreB);
    }
    public void points3ForA(View view)
    {
        scoreA=scoreA+3;
        displayforA(scoreA);
    }
    public void points2ForA(View view)
    {
        scoreA=scoreA+2;
        displayforA(scoreA);
    }
    public void pointsFreeThrowForA(View view)
    {
        scoreA=scoreA+1;
        displayforA(scoreA);
    }
    public void displayforA(int score)
    {
        TextView t=(TextView)findViewById(R.id.teamscoreA);
        t.setText(String.valueOf(score));
    }
    public void points3ForB(View view)
    {
        scoreB=scoreB+3;
        displayforB(scoreB);
    }
    public void points2ForB(View view)
    {
        scoreB=scoreB+2;
        displayforB(scoreB);
    }
    public void pointsFreeThrowForB(View view)
    {
        scoreB=scoreB+1;
        displayforB(scoreB);
    }
    public void displayforB(int score)
    {
        TextView t=(TextView)findViewById(R.id.teamscoreB);
        t.setText(String.valueOf(score));
    }
}
