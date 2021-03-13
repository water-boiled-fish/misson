package com.example.food;

import android.app.Activity;
import android.app.NativeActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public class OnBoardingFragment3 extends Fragment {
    FloatingActionButton fabprogress1;
    FloatingActionButton fabprogress2;
    FloatingActionButton fabprogress3;
    FloatingActionButton fabprogress4;
    FloatingActionButton fabprogress5;
    FloatingActionButton fabprogress6;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_on_board3, container, false);

        fabprogress1 = root.findViewById(R.id.fab);
        fabprogress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });

        fabprogress2 = root.findViewById(R.id.fabprogress);
        fabprogress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Scrolling_item_Activity.class);
                startActivity(intent);
            }
        });

        fabprogress3 = root.findViewById(R.id.fabprogress3);
        fabprogress3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Refresh_Activity.class);
                startActivity(intent);
            }
        });

        fabprogress4 = root.findViewById(R.id.fabprogress4);
        fabprogress4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DashBoardActivity.class);
                startActivity(intent);
            }
        });
        fabprogress5 = root.findViewById(R.id.fabprogress5);
        fabprogress5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Progress_Activity.class);
                startActivity(intent);
            }
        });


        fabprogress6 = root.findViewById(R.id.fabprogress6);
        fabprogress6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DrawlayoutActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}