package com.bdewismart.s183356_basharbdewi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements OnClickListener {

    Button QuickStart;
    Button HighScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Finde  IDs  from the view
        QuickStart = findViewById(R.id.QuickStart);
        HighScore = findViewById(R.id.HighScore);

        // On Click Listener
        QuickStart.setOnClickListener(this);
        HighScore.setOnClickListener(this);
    }

    public void onClick(View v){
        if (v == QuickStart){
            Intent i = new Intent(this, QuickStartActivity.class);
            startActivity(i);
        }
        else if (v == HighScore){
            Intent i = new Intent(this, HighScoreActivity.class);
            startActivity(i);
        }
    }
}