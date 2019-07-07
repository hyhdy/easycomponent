package com.hyh.base_library.compoService;

import android.content.Context;

/**
 * 核心组件service，定义主module与核心组件交互的接口方法
 */
public interface ICoreCompoService {
    /**
     * @param context
     */
    void skipToCoreActivity(Context context);
}
