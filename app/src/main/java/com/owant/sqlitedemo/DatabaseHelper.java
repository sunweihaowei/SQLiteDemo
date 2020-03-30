package com.owant.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 项目名称：SQLiteDemo
 * 创建人：sunweihao
 * 创建时间：2020/3/30 0030  11:03
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    /**
     * Instantiates a new Database helper.
     *
     * @ context 上下文
     * @ name      数据库名称
     * @ factory   游标工程
     * @ version   版本号
     */
    public DatabaseHelper(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.VERSION_COUDE);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
