package com.example.food.tools;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpTools {
    public static void getData (String path){
        new Thread(new Runnable() {
            @Override
            public void run() {
                StringBuilder sb = new StringBuilder();
                try {
                    URL url = new URL(path);

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);

                    connection.setRequestProperty("Content-type","application/x-java-serialized-object");
                    connection.setRequestMethod("GET");

                    connection.connect();

                    OutputStream outputStream = connection.getOutputStream();
                    if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                        InputStream inputStream = connection.getInputStream();
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


                        BufferedReader reader = new BufferedReader(inputStreamReader);
                        String temp;
                        while ((temp = reader.readLine()) != null){
                            sb.append(temp);
                        }
                        reader.close();
                    }
                    connection.disconnect();
                    Log.i("qin1",sb.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }
    public static void postData (String path){
        new Thread(new Runnable() {
            @Override
            public void run() {
                StringBuilder sb = new StringBuilder();
                try {
                    URL url = new URL(path);

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    connection.setDoInput(true);
                    connection.setDoOutput(true);
                    connection.setDefaultUseCaches(false);

                    connection.setRequestMethod("POST");

                    connection.connect();

                    connection.setRequestProperty("Content-type","application/x-java-serialized-object");
                    String body = "key=9be19dfdfd8e1163dfc5efadcf978f66";
                    BufferedWriter writer = new BufferedWriter(
                            new OutputStreamWriter(connection.getOutputStream(),"UTF-8"));
                    writer.write(body);
                    writer.close();







                    OutputStream outputStream = connection.getOutputStream();
                    if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                        InputStream inputStream = connection.getInputStream();
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


                        BufferedReader reader = new BufferedReader(inputStreamReader);
                        String temp;
                        while ((temp = reader.readLine()) != null){
                            sb.append(temp);
                        }
                        reader.close();
                    }
                    connection.disconnect();
                    Log.i("qin1",sb.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }



}
