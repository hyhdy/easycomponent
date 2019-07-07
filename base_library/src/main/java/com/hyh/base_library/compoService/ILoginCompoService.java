package com.hyh.base_library.compoService;

import android.content.Context;

/**
 * 登录组件service，定义主module与登录组件交互的接口方法
 */
public interface ILoginCompoService {
    /**
     * 跳转到登录activity
     * @param context
     */
    void skipToLoginActivity(Context context);
}
