package com.example.food;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class Refresh_Activity extends AppCompatActivity {
    private String[] data = {"下拉刷新√", "多页滑动√", "网络请求√", "json(okhttp)获取√", "进度条(登陆界面bug未显示）","自定义Toolbar√","多线程√","json解析×","呜呜呜别把我扬掉"};
    private String[] sourceData = new String[50];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);
        ListView listView=findViewById(R.id.list_view);
        final SwipeRefreshLayout swipeRefreshLayout=findViewById(R.id.swipe_refresh_layout);
        initData();
        final ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sourceData);
        listView.setAdapter(adapter);
        swipeRefreshLayout.setColorSchemeResources(R.color.pink);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initData();
                adapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

    }
    private void initData() {

        for (int i = 0; i < 50; i++) {
            Random random = new Random();
            int index = random.nextInt(data.length);

            sourceData[i] = data[index];
        }
    }


}
