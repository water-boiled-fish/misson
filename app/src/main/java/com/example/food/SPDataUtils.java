package com.example.food;

import android.content.Context;
import android.content.SharedPreferences;

//实验，实现数据存取
public class SPDataUtils {
    private static final String mFileName = "mydata";

    public static boolean saveUserInfo(Context context,String uname,String upass){
        boolean flag = false;
        SharedPreferences sp = context.getSharedPreferences(mFileName,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("uname",uname);
        editor.putString("upass",upass);
        editor.commit();

        flag = true;
        return flag;
    }

    public static Userinfo getUserinfo(Context context){
        Userinfo user = null;
        SharedPreferences sp = context.getSharedPreferences(mFileName,Context.MODE_PRIVATE);
        String uname = sp.getString("uname",null);
        String upass = sp.getString("upass",null);

        user = new Userinfo();
        user.setUname(uname);
        user.setUname(uname);
        return user;

    }








}
