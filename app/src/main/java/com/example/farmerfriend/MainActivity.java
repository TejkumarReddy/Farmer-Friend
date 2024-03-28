package com.example.farmerfriend;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the image buttons
        ImageButton tomatoButton = findViewById(R.id.tomatoButton);
        ImageButton groundnutButton = findViewById(R.id.groundnutButton);
        ImageButton sugarCaneButton = findViewById(R.id.sugarCaneButton);
        ImageButton paddyButton = findViewById(R.id.paddyButton);

        // Set the onClickListener for each button
        tomatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the TomatoActivity
                Intent intent = new Intent(MainActivity.this, TomatoActivity.class);
                startActivity(intent);
            }
        });

        groundnutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the GroundnutActivity
                Intent intent = new Intent(MainActivity.this, GroundnutActivity.class);
                startActivity(intent);
            }
        });

        sugarCaneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SugarCaneActivity
                Intent intent = new Intent(MainActivity.this, SugarCaneActivity.class);
                startActivity(intent);
            }
        });

        paddyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the PaddyActivity
                Intent intent = new Intent(MainActivity.this, PaddyActivity.class);
                startActivity(intent);
            }
        });
    }
}
