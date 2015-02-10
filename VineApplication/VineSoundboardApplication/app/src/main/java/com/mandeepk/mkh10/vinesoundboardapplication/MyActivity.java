package com.mandeepk.mkh10.vinesoundboardapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import junit.framework.Test;


public class MyActivity extends Activity {
    private Button mNinePlusTenButton;
    private Button mTwentyOneButton;
    private Button mDoItForTheVineButton;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mNinePlusTenButton = (Button) findViewById(R.id.nine_plus_ten);
        mp = MediaPlayer.create(this, R.raw.you_stupid);
        mNinePlusTenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mp.start();
            }
        });

        mTwentyOneButton = (Button) findViewById(R.id.twenty_one);
        mp = MediaPlayer.create(this, R.raw.twenty_one);
        mTwentyOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
