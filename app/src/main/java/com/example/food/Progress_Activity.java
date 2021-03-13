package com.example.food;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Progress_Activity extends Activity {
    ProgressBar progressBar;
    int i = 0;
    int progressBarMax = 100;

    Handler handler = new Handler();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_processbar);
        progressBar = (ProgressBar) findViewById(R.id.progressBar4);
        progressBarMax = progressBar.getMax();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i++ < progressBarMax) {
                    //设置滚动条当前状态值
                    progressBar.setProgress(i);
                    try {
                        Thread.sleep(80);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }

        }).start();


    }
}