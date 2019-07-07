package com.hyh.login_component;

import com.hyh.base_library.ComServiceFactory;
import com.hyh.base_library.compoService.IAppComponent;

public class LoginComponent implements IAppComponent {

    @Override
    public void initialize() {
        ComServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
