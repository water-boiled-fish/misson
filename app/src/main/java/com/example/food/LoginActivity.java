package com.example.food;

import android.content.DialogInterface;
import android.content.pm.LauncherApps;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.food.tools.HttpTools;
import com.example.food.utils.OkhttpHelpr;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton email,wechat,phone;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        email = findViewById(R.id.email);
        wechat = findViewById(R.id.wechat);
        phone = findViewById(R.id.phone);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);



        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        email.setTranslationY(300);
        wechat.setTranslationY(300);
        phone.setTranslationY(300);
        tabLayout.setTranslationY(300);

        email.setAlpha(v);
        wechat.setAlpha(v);
        phone.setAlpha(v);
        tabLayout.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        wechat.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        phone.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();


        initRequest();


    }

    private void initRequest() {
        String url = "http://v.juhe.cn/toutiao/index?key=9be19dfdfd8e1163dfc5efadcf978f66";
        OkhttpHelpr.getRequest(url, new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.i("22222","onFaliure:"+e.getMessage());
                //parseJSONWithGSON();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                Log.i("22222","onResponse:"+response.body().string());
            }
        }
        );

    }

    private void parseJSONWithGSON(String jsonData){
        Gson gson = new Gson();
        List<App> appList = gson.fromJson(jsonData,new TypeToken<List<App>>(){}.getType());
        for (App app : appList){
            Log.i("LonginActivity","id is" + app.getId());
            Log.i("LonginActivity","name is" + app.getName());
            Log.i("LonginActivity","version is" + app.getVersion());

        }


    }
    //public void getNewsData() {
    //    HttpTools.postData("http://v.juhe.cn/toutiao/index?key=9be19dfdfd8e1163dfc5efadcf978f66");
    //}



}