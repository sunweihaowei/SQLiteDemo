package com.owant.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //这是一个孤独的类，而且还是abstract抽象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //数据库的使用
        DatabaseHelper databaseHelper=new DatabaseHelper(this);//实例化数据库子类
        databaseHelper.getWritableDatabase();//获取到可读的数据库
    }


}
