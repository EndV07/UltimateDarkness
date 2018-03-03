package com.endv.game.ultimatedarkness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button[] villainButtons = new Button[3];
    private Button[] heroButtons = new Button[3];
    private TextView villainlp;
    private TextView herolp;
    private TextView minionstats;
    private TextView gamelog;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        villainButtons[0] = findViewById(R.id.vAttack);
        villainButtons[1] = findViewById(R.id.vDefense);
        villainButtons[2] = findViewById(R.id.vRestore);

        heroButtons[0] = findViewById(R.id.hAttack);
        heroButtons[1] = findViewById(R.id.hDefense);
        heroButtons[2] = findViewById(R.id.hRestore);

        villainlp = findViewById(R.id.villainLifePoints);
        herolp = findViewById(R.id.HeroLifePoints2);
        minionstats = findViewById(R.id.minionInfo);
        gamelog = findViewById(R.id.gameLog);

        Villain villan = new Villain();
        Hero hero = new Hero();
        Minion minion = new Minion(10);

        villainlp.setText(villan.getLifePoint() + " LP");
        herolp.setText(hero.getLifePoint() + " LP");
        minionstats.setText("Mionion: " + minion.getLifePoint() + " LP");
    }
}
