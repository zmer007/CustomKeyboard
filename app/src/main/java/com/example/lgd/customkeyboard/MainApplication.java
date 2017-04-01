package com.example.lgd.customkeyboard;

import android.app.Application;
import android.content.Context;

/**
 * User: lgd(1779964617@qq.com)
 * Date: 2017/4/1
 * Function:
 */
public class MainApplication extends Application {
    private static MainApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getInstance() {
        return instance;
    }
}
