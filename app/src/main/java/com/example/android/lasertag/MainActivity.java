package com.example.android.lasertag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.UpdateLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamAJohanna = 0;
    int scoreTeamASina = 0;
    int scoreTeamB = 0;
    int scoreTeamBKim = 0;
    int scoreTeamBVerena = 0;
    int livesTeamA = 20;
    int livesTeamB = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("ScoreTeamA", scoreTeamA);
        savedInstanceState.putInt("ScoreTeamB", scoreTeamB);
        savedInstanceState.putInt("ScoreTeamAJohanna", scoreTeamAJohanna);
        savedInstanceState.putInt("ScoreTeamASina", scoreTeamASina);
        savedInstanceState.putInt("ScoreTeamBKim", scoreTeamBKim);
        savedInstanceState.putInt("ScoreTeamBVerena", scoreTeamBVerena);
        savedInstanceState.putInt("LivesTeamA", livesTeamA);
        savedInstanceState.putInt("LivesTeamB", livesTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("ScoreTeamA");
            scoreTeamB = savedInstanceState.getInt("ScoreTeamB");
            scoreTeamAJohanna = savedInstanceState.getInt("ScoreTeamAJohanna");
            scoreTeamASina = savedInstanceState.getInt("ScoreTeamASina");
            scoreTeamBKim = savedInstanceState.getInt("ScoreTeamBKim");
            scoreTeamBVerena = savedInstanceState.getInt("ScoreTeamBVerena");
            livesTeamA = savedInstanceState.getInt("LivesTeamA");
            livesTeamB = savedInstanceState.getInt("LivesTeamB");
            displayScoreForTeamA(scoreTeamA);
            displayScoreForTeamB(scoreTeamB);
            displayScoreForTeamAJohanna(scoreTeamAJohanna);
            displayScoreForTeamASina(scoreTeamASina);
            displayScoreForTeamBKim(scoreTeamBKim);
            displayScoreForTeamBVerena(scoreTeamBVerena);
            displayLivesForTeamA(livesTeamA);
            displayLivesForTeamB(livesTeamB);
        }
        super.onRestoreInstanceState(savedInstanceState);
    }

    /**
     * Displays the given score for Team A
     */
    private void displayScoreForTeamA(int scoreA) {
        String showScoreTeamA = "Total score: " + scoreA + " Points";
        TextView scoreBTextView = (TextView) findViewById(R.id.score_team_a);
        scoreBTextView.setText(showScoreTeamA);
    }

    /**
     * Displays the given score for Johanna in Team A
     */
    private void displayScoreForTeamAJohanna(int scoreJohanna) {
        String showScoreTeamAJohanna = "Scored: " + scoreJohanna + " Points";
        TextView scoreTeamAJohannaTextView = (TextView) findViewById(R.id.score_johanna);
        scoreTeamAJohannaTextView.setText(showScoreTeamAJohanna);
    }

    /**
     * Displays the given score for Sina in Team A
     */
    private void displayScoreForTeamASina(int scoreSina) {
        String showScoreTeamASina = "Scored: " + scoreSina + " Points";
        TextView scoreTeamASinaTextView = (TextView) findViewById(R.id.score_sina);
        scoreTeamASinaTextView.setText(showScoreTeamASina);
    }

    /**
     * Displays the given score for Team B
     */
    private void displayScoreForTeamB(int scoreB) {
        String showScoreTeamB = "Total score: " + scoreB + " Points";
        TextView scoreBTextView = (TextView) findViewById(R.id.score_team_b);
        scoreBTextView.setText(showScoreTeamB);
    }

    /**
     * Displays the given score for Kim in Team B
     */
    private void displayScoreForTeamBKim(int scoreKim) {
        String showScoreTeamBKim = "Scored: " + scoreKim + " Points";
        TextView scoreTeamBKimTextView = (TextView) findViewById(R.id.score_kim);
        scoreTeamBKimTextView.setText(showScoreTeamBKim);
    }

    /**
     * Displays the given score for Verena in Team B
     */

    private void displayScoreForTeamBVerena(int scoreVerena) {
        String showScoreTeamBVerena = "Scored: " + scoreVerena + " Points";
        TextView scoreTeamBVerenaTextView = (TextView) findViewById(R.id.score_verena);
        scoreTeamBVerenaTextView.setText(showScoreTeamBVerena);
    }

    private void displayLivesForTeamA(int lives) {
        String showLivesForTeamA = "Remaining lives: " + lives;
        TextView teamALivesTextView = (TextView) findViewById(R.id.lives_team_a);
        teamALivesTextView.setText(showLivesForTeamA);
    }

    /**
     * Displays the remaining lives for Team B.
     */
    private void displayLivesForTeamB(int lives) {
        String showLivesForTeamB = "Remaining lives: " + lives;
        TextView teamBLivesTextView = (TextView) findViewById(R.id.lives_team_b);
        teamBLivesTextView.setText(showLivesForTeamB);
    }


    /**
     * When Team A makes a hit it gets +10 points, Johanna gets +10 Points
     */
    public void hitForTeamAJohanna(View v) {
        scoreTeamA = scoreTeamA + 10;
        if (livesTeamB == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team B", Toast.LENGTH_SHORT).show();
            return;}
            livesTeamB = livesTeamB - 1;
            scoreTeamAJohanna = scoreTeamAJohanna + 10;
            displayLivesForTeamB(livesTeamB);
            displayScoreForTeamA(scoreTeamA);
            displayScoreForTeamAJohanna(scoreTeamAJohanna);
        }

    /**
     * When Team A makes a hit it gets +10 points, Sina gets +10 Points
     */
    public void hitForTeamASina(View v) {
        scoreTeamA = scoreTeamA + 10;
        if (livesTeamB == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team B", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamB = livesTeamB - 1;
        scoreTeamASina = scoreTeamASina +10;
        displayLivesForTeamB(livesTeamB);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamASina(scoreTeamASina);
    }

    /**
     * When Team A makes a special hit it gets +15 points, Johanna gets +15 Points
     */
    public void specialhitForTeamAJohanna(View v) {
        scoreTeamA = scoreTeamA + 15;
        if (livesTeamB == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team B", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamB = livesTeamB - 1;
        scoreTeamAJohanna = scoreTeamAJohanna +15;
        displayLivesForTeamB(livesTeamB);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamAJohanna(scoreTeamAJohanna);
    }

    /**
     * When Team A makes a special hit it gets +15 points, Sina gets +15 Points
     */
    public void specialhitForTeamASina(View v) {
        scoreTeamA = scoreTeamA + 15;
        if (livesTeamB == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team B", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamB = livesTeamB - 1;
        scoreTeamASina = scoreTeamASina +15;
        displayLivesForTeamB(livesTeamB);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamASina(scoreTeamASina);
    }

    /**
     * When Team B makes a hit it gets +10 points, Kim gets +10 Points
     */
    public void hitForTeamBKim(View v) {
        scoreTeamB = scoreTeamB + 10;
        if (livesTeamA == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team A", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamA = livesTeamA - 1;
        scoreTeamBKim = scoreTeamBKim +10;
        displayLivesForTeamA(livesTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayScoreForTeamBKim(scoreTeamBKim);
    }

    /**
     * When Team B makes a hit it gets +10 points, Verena gets +10 Points
     */
    public void hitForTeamBVerena(View v) {
        scoreTeamB = scoreTeamB + 10;
        if (livesTeamA == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team A", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamA = livesTeamA - 1;
        scoreTeamBVerena = scoreTeamBVerena +10;
        displayLivesForTeamA(livesTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayScoreForTeamBVerena(scoreTeamBVerena);
    }

    /**
     * When Team B makes a special hit it gets +15 points, Kim gets +15 Points
     */
    public void specialHitForTeamBKim(View v) {
        scoreTeamB = scoreTeamB + 15;
        if (livesTeamA == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team A", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamA = livesTeamA - 1;
        scoreTeamBKim = scoreTeamBKim +15;
        displayLivesForTeamA(livesTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayScoreForTeamBKim(scoreTeamBKim);
    }

    /**
     * When Team B makes a special hit it gets +15 points, Verena gets +15 Points
     */
    public void specialHitForTeamBVerena(View v) {
        scoreTeamB = scoreTeamB + 15;
        if (livesTeamA == 0) {
            //toast Message
            Toast.makeText(this, "You cannot have less then 0 lives. Game over for Team A", Toast.LENGTH_SHORT).show();
            return;}
        livesTeamA = livesTeamA - 1;
        scoreTeamBVerena = scoreTeamBVerena +15;
        displayLivesForTeamA(livesTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayScoreForTeamBVerena(scoreTeamBVerena);
    }

    /**
     * Starts a new game and sets all value to the initial value
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamAJohanna = 0;
        scoreTeamASina = 0;
        scoreTeamBKim = 0;
        scoreTeamBVerena = 0;
        livesTeamA = 20;
        livesTeamB = 20;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayScoreForTeamAJohanna(scoreTeamAJohanna);
        displayScoreForTeamASina(scoreTeamASina);
        displayScoreForTeamBKim(scoreTeamBKim);
        displayScoreForTeamBVerena(scoreTeamBVerena);
        displayLivesForTeamA(livesTeamA);
        displayLivesForTeamB(livesTeamB);
    }

}
