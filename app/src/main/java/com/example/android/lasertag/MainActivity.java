package com.example.android.lasertag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.UpdateLayout;
import android.view.View;
import android.widget.TextView;

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
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("ScoreTeamA");
        scoreTeamB = savedInstanceState.getInt("ScoreTeamB");
        scoreTeamAJohanna = savedInstanceState.getInt("ScoreTeamAJohanna");
        scoreTeamASina = savedInstanceState.getInt("ScoreTeamASina");
        scoreTeamBKim = savedInstanceState.getInt("ScoreTeamBKim");
        scoreTeamBVerena = savedInstanceState.getInt("ScoreTeamBVerena");
        livesTeamA = savedInstanceState.getInt("LivesTeamA");
        livesTeamB = savedInstanceState.getInt("LivesTeamB");
    }

    /**
     * Displays the given score for Team A
     */
    private void displayScoreForTeamA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.score_team_a);
        priceTextView.setText(message);
    }

    /**
     * Displays the given score for Johanna in Team A
     */
    private void displayScoreForTeamAJohanna(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.score_johanna);
        priceTextView.setText(message);
    }

    /**
     * Displays the given score for Sina in Team A
     */
    private void displayScoreForTeamASina(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.score_sina);
        priceTextView.setText(message);
    }

    /**
     * Displays the given score for Team B
     */
    private void displayScoreForTeamB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.score_team_b);
        priceTextView.setText(message);
    }

    /**
     * Displays the given score for Kim in Team B
     */
    private void displayScoreForTeamBKim(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.score_kim);
        priceTextView.setText(message);
    }

    /**
     * Displays the given score for Verena in Team B
     */
    private void displayScoreForTeamBVerena(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.score_verena);
        priceTextView.setText(message);
    }


    /**
     * Displays the remaining lives for Team A.
     */
    private void displayLivesForTeamA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.lives_team_a);
        priceTextView.setText(message);
    }

    /**
     * Displays the remaining lives for Team B.
     */
    private void displayLivesForTeamB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.lives_team_b);
        priceTextView.setText(message);
    }


    /**
     * When Team A makes a hit it gets +10 points, Johanna gets +10 Points
     */
    public void hitForTeamAJohanna(View v) {
        scoreTeamA = scoreTeamA + 10;
        livesTeamB = livesTeamB - 1;
        scoreTeamAJohanna = scoreTeamAJohanna +10;
        String showScoreTeamA = "Total score: " + scoreTeamA + " Points";
        String showLivesForTeamB = "Remaining lives: " + livesTeamB;
        String showScoreTeamAJohanna = "Scored: " + scoreTeamAJohanna + " Points";
        displayLivesForTeamB(showLivesForTeamB);
        displayScoreForTeamA(showScoreTeamA);
        displayScoreForTeamAJohanna(showScoreTeamAJohanna);
    }

    /**
     * When Team A makes a hit it gets +10 points, Sina gets +10 Points
     */
    public void hitForTeamASina(View v) {
        scoreTeamA = scoreTeamA + 10;
        livesTeamB = livesTeamB - 1;
        scoreTeamASina = scoreTeamASina +10;
        String showScoreTeamA = "Total score: " + scoreTeamA + " Points";
        String showLivesForTeamB = "Remaining lives: " + livesTeamB;
        String showScoreTeamASina = "Scored: " + scoreTeamASina + " Points";
        displayLivesForTeamB(showLivesForTeamB);
        displayScoreForTeamA(showScoreTeamA);
        displayScoreForTeamASina(showScoreTeamASina);
    }

    /**
     * When Team A makes a special hit it gets +15 points, Johanna gets +15 Points
     */
    public void specialhitForTeamAJohanna(View v) {
        scoreTeamA = scoreTeamA + 15;
        livesTeamB = livesTeamB - 1;
        scoreTeamAJohanna = scoreTeamAJohanna +15;
        String showScoreTeamA = "Total score: " + scoreTeamA + " Points";
        String showLivesForTeamB = "Remaining lives: " + livesTeamB;
        String showScoreTeamAJohanna = "Scored: " + scoreTeamAJohanna + " Points";
        displayLivesForTeamB(showLivesForTeamB);
        displayScoreForTeamA(showScoreTeamA);
        displayScoreForTeamAJohanna(showScoreTeamAJohanna);
    }

    /**
     * When Team A makes a special hit it gets +15 points, Sina gets +15 Points
     */
    public void specialhitForTeamASina(View v) {
        scoreTeamA = scoreTeamA + 15;
        livesTeamB = livesTeamB - 1;
        scoreTeamASina = scoreTeamASina +15;
        String showScoreTeamA = "Total score: " + scoreTeamA + " Points";
        String showLivesForTeamB = "Remaining lives: " + livesTeamB;
        String showScoreTeamASina = "Scored: " + scoreTeamASina + " Points";
        displayLivesForTeamB(showLivesForTeamB);
        displayScoreForTeamA(showScoreTeamA);
        displayScoreForTeamASina(showScoreTeamASina);
    }

    /**
     * When Team B makes a hit it gets +10 points, Kim gets +10 Points
     */
    public void hitForTeamBKim(View v) {
        scoreTeamB = scoreTeamB + 10;
        livesTeamA = livesTeamA - 1;
        scoreTeamBKim = scoreTeamBKim +10;
        String showScoreTeamB = "Total score: " + scoreTeamB + " Points";
        String showLivesForTeamA = "Remaining lives: " + livesTeamA;
        String showScoreTeamBKim = "Scored: " + scoreTeamBKim + " Points";
        displayLivesForTeamA(showLivesForTeamA);
        displayScoreForTeamB(showScoreTeamB);
        displayScoreForTeamBKim(showScoreTeamBKim);
    }

    /**
     * When Team B makes a hit it gets +10 points, Verena gets +10 Points
     */
    public void hitForTeamBVerena(View v) {
        scoreTeamB = scoreTeamB + 10;
        livesTeamA = livesTeamA - 1;
        scoreTeamBVerena = scoreTeamBVerena +10;
        String showScoreTeamB = "Total score: " + scoreTeamB + " Points";
        String showLivesForTeamA = "Remaining lives: " + livesTeamA;
        String showScoreTeamBVerena = "Scored: " + scoreTeamBVerena + " Points";
        displayLivesForTeamA(showLivesForTeamA);
        displayScoreForTeamB(showScoreTeamB);
        displayScoreForTeamBVerena(showScoreTeamBVerena);
    }

    /**
     * When Team B makes a special hit it gets +15 points, Kim gets +15 Points
     */
    public void specialHitForTeamBKim(View v) {
        scoreTeamB = scoreTeamB + 15;
        livesTeamA = livesTeamA - 1;
        scoreTeamBKim = scoreTeamBKim +15;
        String showScoreTeamB = "Total score: " + scoreTeamB + " Points";
        String showLivesForTeamA = "Remaining lives: " + livesTeamA;
        String showScoreTeamBKim = "Scored: " + scoreTeamBKim + " Points";
        displayLivesForTeamA(showLivesForTeamA);
        displayScoreForTeamB(showScoreTeamB);
        displayScoreForTeamBKim(showScoreTeamBKim);
    }

    /**
     * When Team B makes a special hit it gets +15 points, Verena gets +15 Points
     */
    public void specialHitForTeamBVerena(View v) {
        scoreTeamB = scoreTeamB + 15;
        livesTeamA = livesTeamA - 1;
        scoreTeamBVerena = scoreTeamBVerena +15;
        String showScoreTeamB = "Total score: " + scoreTeamB + " Points";
        String showLivesForTeamA = "Remaining lives: " + livesTeamA;
        String showScoreTeamBVerena = "Scored: " + scoreTeamBVerena + " Points";
        displayLivesForTeamA(showLivesForTeamA);
        displayScoreForTeamB(showScoreTeamB);
        displayScoreForTeamBVerena(showScoreTeamBVerena);
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
        String showScoreTeamA = "Total score: " + scoreTeamA + " Points";
        String showScoreTeamB = "Total score: " + scoreTeamB + " Points";
        String showScoreTeamAJohanna = "Scored: " + scoreTeamAJohanna + " Points";
        String showScoreTeamASina = "Scored: " + scoreTeamASina + " Points";
        String showScoreTeamBKim = "Scored: " + scoreTeamBKim + " Points";
        String showScoreTeamBVerena = "Scored: " + scoreTeamBVerena + " Points";
        String showLivesForTeamA = "Remaining lives: " + livesTeamA;
        String showLivesForTeamB = "Remaining lives: " + livesTeamB;
        displayScoreForTeamA(showScoreTeamA);
        displayScoreForTeamB(showScoreTeamB);
        displayScoreForTeamAJohanna(showScoreTeamAJohanna);
        displayScoreForTeamASina(showScoreTeamASina);
        displayScoreForTeamBKim(showScoreTeamBKim);
        displayScoreForTeamBVerena(showScoreTeamBVerena);
        displayLivesForTeamA(showLivesForTeamA);
        displayLivesForTeamB(showLivesForTeamB);
    }

}
