package com.example.food;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.example.food.tools.HttpTools;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class Scrolling_item_Activity extends AppCompatActivity {

    CollapsingToolbarLayout mToolbarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_item_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());



        mToolbarLayout = findViewById(R.id.toolbar_layout);
        Glide.with(this)
                .load("https://th.bing.com/th/id/Redf3580c454000b1e847ef2c78486c6f?rik=uk3r2S%2fuuZ2gsg&riu=http%3a%2f%2fi0.hdslb.com%2fbfs%2farticle%2f6714674ef98ad9df11b5d913c3a601ed1fe08599.jpg&ehk=cwlTHhWZPzQKtCGJMJHUbuxWjOk2a7cU%2fXsLRMEtCFU%3d&risl=&pid=ImgRaw")
                .into(new CustomTarget<Drawable>() {


                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                        mToolbarLayout.setBackground(resource);
                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {

                    }

                });
    }

}