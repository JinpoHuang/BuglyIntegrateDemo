package com.starnet.buglyintegratedemo;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

public class BuglyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        CrashReport.initCrashReport(getApplicationContext(), "043c2cf3cb", true);
        Bugly.init(getApplicationContext(),"043c2cf3cb",true);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 必须安装multiDex
        MultiDex.install(base);
        // 安装tinker
        Beta.installTinker();
    }
}
