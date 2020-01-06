package com.hyh.easycomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hyh.base_library.component.core.proxy.CoreServiceProxy;
import com.hyh.base_library.component.login.proxy.LoginServiceProxy;

public class MainActivity extends AppCompatActivity {
    private TextView mTvSkipLogin;
    private TextView mTvSkipCore;
    private LoginServiceProxy mLoginServiceAdapter = new LoginServiceProxy();
    private CoreServiceProxy mCoreServiceAdapter = new CoreServiceProxy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvSkipLogin = findViewById(R.id.tv_skip_login);
        mTvSkipLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到login组件
                mLoginServiceAdapter.skipToLoginActivity(MainActivity.this);
            }
        });

        mTvSkipCore = findViewById(R.id.tv_skip_core);
        mTvSkipCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CoreServiceProxy coreServiceAdapter = new CoreServiceProxy();
                //跳转到core组件
                mCoreServiceAdapter.skipToCoreActivity(MainActivity.this);
            }
        });
    }
}
