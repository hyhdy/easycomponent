package com.hyh.login_component;

import android.content.Context;
import android.content.Intent;

import com.hyh.base_library.compoService.ILoginCompoService;

public class LoginService implements ILoginCompoService {
    @Override
    public void skipToLoginActivity(Context context) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
