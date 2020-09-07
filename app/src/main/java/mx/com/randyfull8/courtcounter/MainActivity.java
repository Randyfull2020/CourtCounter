package mx.com.randyfull8.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int marcadorA = 0;
    private int marcadorB= 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(score));
    }
    public void unoA (View view) {
        marcadorA = marcadorA + 1;
        displayForTeamA(marcadorA);
    }

    public void dosA (View view) {
        marcadorA = marcadorA + 2;
        displayForTeamA(marcadorA);
    }
    public void tresA(View view) {
        marcadorA = marcadorA + 3;
        displayForTeamA(marcadorA);
    }
    public void reset(View view) {
        marcadorA = 0;
        marcadorB = 0;
        displayForTeamA(marcadorA);
        displayForTeamB(marcadorB);
    }

    public void unoB(View view) {
        marcadorB = marcadorB + 1;
        displayForTeamB(marcadorB);
    }

    public void dosB(View view) {
        marcadorB = marcadorB + 2;
        displayForTeamB(marcadorB);
    }

    public void tresB(View view) {
        marcadorB = marcadorB + 3;
        displayForTeamB(marcadorB);
    }




}