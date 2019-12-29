package com.hyh.base_library.component;

import android.content.Context;

import com.hyh.base_library.MyApplication;
import com.hyh.base_library.component.core.ICoreComponent;
import com.hyh.base_library.component.login.ILoginComponent;
import java.lang.reflect.Constructor;

/**
 * created by curdyhuang on 2019-11-04
 * 组件工厂负责组件创建，单例
 */
public class ComponentFactory implements IComponentFactory{
    private ILoginComponent mLoginComponent;
    private ICoreComponent mCoreComponent;

    private static class Holder{
        private static final ComponentFactory sInstance = new ComponentFactory();
    }

    public static ComponentFactory getInstance(){
        return Holder.sInstance;
    }

    private ComponentFactory() {
    }

    @Override
    public ILoginComponent createLoginComponent() {
        if(mLoginComponent == null){
            try {
                Class<?> clazz = Class.forName("com.hyh.login_component.LoginComponent");
                mLoginComponent = (ILoginComponent) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mLoginComponent;
    }

    @Override
    public ICoreComponent createCoreComponent() {
        if(mCoreComponent == null){
            try {
                Class<?> clazz = Class.forName("com.hyh.core_component.CoreComponent");
                mCoreComponent = (ICoreComponent) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mCoreComponent;
    }
}
