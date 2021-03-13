package com.example.food;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class DrawlayoutActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawlayout);
        drawerLayout = (DrawerLayout) findViewById(R.id.draw);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

    }

}
