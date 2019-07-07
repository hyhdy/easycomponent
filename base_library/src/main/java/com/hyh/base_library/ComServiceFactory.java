package com.hyh.base_library;

import com.hyh.base_library.compoService.EmptyCoreService;
import com.hyh.base_library.compoService.EmptyLoginService;
import com.hyh.base_library.compoService.ICoreCompoService;
import com.hyh.base_library.compoService.ILoginCompoService;

/**
 * 组件service工厂类
 */
public class ComServiceFactory {
    private static class HOLDER{
        private static final ComServiceFactory mInstance = new ComServiceFactory();
    }

    private ComServiceFactory() {
    }

    public static ComServiceFactory getInstance(){
        return HOLDER.mInstance;
    }

    private ILoginCompoService mLoginService;
    private ICoreCompoService mCoreService;

    public ILoginCompoService getLoginService() {
        if(mLoginService == null){
            return new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setLoginService(ILoginCompoService loginService) {
        mLoginService = loginService;
    }

    public ICoreCompoService getCoreService() {
        if(mCoreService == null){
            return new EmptyCoreService();
        }
        return mCoreService;
    }

    public void setCoreService(ICoreCompoService coreService) {
        mCoreService = coreService;
    }
}
