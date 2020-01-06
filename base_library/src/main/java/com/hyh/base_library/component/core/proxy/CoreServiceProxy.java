package com.hyh.base_library.component.core.proxy;

import android.content.Context;
import android.widget.Toast;

import com.hyh.base_library.component.ComponentFactory;
import com.hyh.base_library.component.core.ICoreComponent;
import com.hyh.base_library.component.core.service.ICoreService;

/**
 * created by curdyhuang on 2019-12-30
 */
public class CoreServiceProxy implements ICoreService {
    private ICoreService mCoreService;

    public CoreServiceProxy() {
        ICoreComponent coreComponent = ComponentFactory.getInstance().createCoreComponent();
        if(coreComponent!=null){
            mCoreService = coreComponent.getCoreService();
        }
    }

    @Override
    public void skipToCoreActivity(Context context) {
        if(mCoreService!=null){
            mCoreService.skipToCoreActivity(context);
        }else{
            Toast.makeText(context,"加载组件失败",Toast.LENGTH_SHORT).show();
        }
    }
}
