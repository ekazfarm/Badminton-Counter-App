package com.ekawafers.badminton_couter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView namaTeamA, namaTeamB, TVScoreA, TVScoreB, MenangA, MenangB;
    Button PlusA, PlusB, MinusA, MinusB, Reset;
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaTeamA = findViewById(R.id.tvTeamA);
        namaTeamB = findViewById(R.id.tvTeamB);
        TVScoreA = findViewById(R.id.scoreteamA);
        TVScoreB = findViewById(R.id.scoreteamB);
        PlusA = findViewById(R.id.btnPlusA);
        PlusB = findViewById(R.id.btnPlusB);
        MinusA = findViewById(R.id.btnMinusTeamA);
        MinusB = findViewById(R.id.btnMinusTeamB);
        Reset = findViewById(R.id.btnreset);
        MenangA = findViewById(R.id.tvwiningA);
        MenangB = findViewById(R.id.tvWiningB);

    }

    public void PlusA(View view) {
        scoreA += 1;
        TVScoreA.setText(String.valueOf(scoreA));
        winningTeam();
    }

    public void MinusA(View view) {
        scoreA -= 1;
        TVScoreA.setText(String.valueOf(scoreA));
        winningTeam();
    }

    public void PlusB(View view) {
        scoreB += 1;
        TVScoreB.setText(String.valueOf(scoreB));
        winningTeam();
    }

    public void MinusB(View view) {
        scoreB -= 1;
        TVScoreB.setText(String.valueOf(scoreB));
        winningTeam();
    }

    public void Reset(View view) {
        scoreA = 0;
        TVScoreA.setText(String.valueOf(scoreA));
        scoreB = 0;
        TVScoreB.setText(String.valueOf(scoreB));
    }

    private void winningTeam() {
        if (scoreA>scoreB){
            MenangA.setVisibility(MenangA.VISIBLE);
            MenangB.setVisibility(MenangB.INVISIBLE);
        }else if (scoreA<scoreB) {
            MenangA.setVisibility(MenangA.INVISIBLE);
            MenangB.setVisibility(MenangB.VISIBLE);
        }else{
            MenangA.setVisibility(MenangA.INVISIBLE);
            MenangB.setVisibility(MenangB.INVISIBLE);
        }
    }
}