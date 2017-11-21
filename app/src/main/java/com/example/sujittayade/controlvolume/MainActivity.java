package com.example.sujittayade.controlvolume;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);

        Button downButton = findViewById(R.id.tvLow);
        downButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
                Log.e("wow", "onClick: max"+audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
                Log.e("wow", "onClick:stream volume "+audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            }
        });

        Button upButton = findViewById(R.id.tvHigh);
        upButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            }
        });


    }
}
