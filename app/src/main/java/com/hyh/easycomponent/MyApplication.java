package com.hyh.easycomponent;

import android.app.Application;

import com.hyh.base_library.compoService.IAppComponent;

public class MyApplication extends Application {
    public static final String[] sComponentList = new String[]{
        "com.hyh.login_component.LoginComponent", "com.hyh.core_component.CoreComponent"
    };
    private static MyApplication mApplication;

    public static Application getApplication(){
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        //初始化各个组件
        for(String className: sComponentList){
            try {
                Class<?> clazz = Class.forName(className);
                Object object = clazz.newInstance();
                if(object instanceof IAppComponent){
                    ((IAppComponent) object).initialize();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
