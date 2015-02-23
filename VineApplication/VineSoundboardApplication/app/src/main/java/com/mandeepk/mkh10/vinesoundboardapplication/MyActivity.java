package com.mandeepk.mkh10.vinesoundboardapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import junit.framework.Test;


public class MyActivity extends ActionBarActivity {
    private Button mNinePlusTenButton;
    private Button mTwentyOneButton;
    private Button mDoItForTheVineButton;
    private Button mRavioliButton;
    private Button mDontDoItButton;
    private Button mOhMyGodButton;
    private Button mNotMyDadButton;
    private Button mWhereDeyAtDoeButton;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }


        mNinePlusTenButton = (Button) findViewById(R.id.nine_plus_ten);
        mNinePlusTenButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=BzVXbeASRiQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mTwentyOneButton = (Button) findViewById(R.id.twenty_one);
        mTwentyOneButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=BzVXbeASRiQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mDoItForTheVineButton = (Button) findViewById(R.id.do_it_for_the_vine);
        mDoItForTheVineButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=24FaTsnkYYM");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mRavioliButton = (Button) findViewById(R.id.ravioli);
        mRavioliButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=KMaGAl3QosY");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mDontDoItButton = (Button) findViewById(R.id.oh_dont_do);
        mDontDoItButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=XPB6pAA_oFs");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mOhMyGodButton = (Button) findViewById(R.id.omg);
        mOhMyGodButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ov8mAjlDhd8");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mNotMyDadButton = (Button) findViewById(R.id.not_my_dad);
        mNotMyDadButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=vbfVd2bqFXg");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

        mWhereDeyAtDoeButton = (Button) findViewById(R.id.where_they_at);
        mWhereDeyAtDoeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Zt8m3--nREE");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            }
        });

    };


//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.my, menu);
//        return true;
//    }

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

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nine_plus_ten:
                playSound(R.raw.nine_plus_ten_sc);
                break;
            case R.id.twenty_one:
                playSound(R.raw.twenty_one);
                break;
            case R.id.do_it_for_the_vine:
                playSound(R.raw.diftvsc);
                break;
            case R.id.ravioli:
                playSound(R.raw.ravioli_vine);
                break;
            case R.id.oh_dont_do:
                playSound(R.raw.oh_dont_do_it);
                break;
            case R.id.omg:
                playSound(R.raw.omg);
                break;
            case R.id.not_my_dad:
                playSound(R.raw.not_my_dad);
                break;
            case R.id.where_they_at:
                playSound(R.raw.where_they_at_doe);
            default:
                break;
        }
    }



    public void playSound(int input){
        if (mp!=null){
            mp.reset();
            mp.release();
        }
        mp = MediaPlayer.create(this, input);
        mp.start();
    }
}
