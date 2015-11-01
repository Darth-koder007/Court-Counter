package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void PlusOneA(View view){
      scoreA=scoreA+1;
      displayScoreA(scoreA);
    }
    public void PlusTwoPointA(View view){
        scoreA=scoreA+2;
        displayScoreA(scoreA);
    }

    public void PlusThreePointA(View view){
        scoreA=scoreA+3;
        displayScoreA(scoreA);
    }
    public void displayScoreA(int NewScore){
        TextView scoreView =(TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(NewScore));
    }

    public void PlusOneB(View view){
        scoreB=scoreB+1;
        displayScoreB(scoreB);
    }
    public void PlusTwoPointB(View view){
        scoreB=scoreB+2;
        displayScoreB(scoreB);
    }

    public void PlusThreePointB(View view){
        scoreB=scoreB+3;
        displayScoreB(scoreB);
    }
    public void displayScoreB(int NewScore){
        TextView scoreView =(TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(NewScore));
    }

    public void ResetScores(View view)
    {
        scoreA=0;
        scoreB=0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }

}
