package com.hyh.login_component;
import com.hyh.base_library.component.login.ILoginComponent;
import com.hyh.base_library.component.login.service.ILoginService;

public class LoginComponent implements ILoginComponent {

    @Override
    public ILoginService getLoginService() {
        return new LoginService();
    }
}
