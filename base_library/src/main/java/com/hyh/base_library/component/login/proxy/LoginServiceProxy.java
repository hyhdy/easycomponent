package com.hyh.base_library.component.login.proxy;

import android.content.Context;
import android.widget.Toast;

import com.hyh.base_library.component.ComponentFactory;
import com.hyh.base_library.component.login.ILoginComponent;
import com.hyh.base_library.component.login.service.ILoginService;

/**
 * created by curdyhuang on 2019-12-30
 */
public class LoginServiceProxy implements ILoginService {
    private ILoginService mLoginService;

    public LoginServiceProxy() {
        ILoginComponent loginComponent = ComponentFactory.getInstance().createLoginComponent();
        if(loginComponent!=null){
            mLoginService = loginComponent.getLoginService();
        }
    }

    @Override
    public void skipToLoginActivity(Context context) {
        if(mLoginService!=null){
            mLoginService.skipToLoginActivity(context);
        }else{
            Toast.makeText(context,"加载组件失败",Toast.LENGTH_SHORT).show();
        }
    }
}
