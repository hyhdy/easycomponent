package com.hyh.easycomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hyh.base_library.component.core.adapter.CoreServiceAdapter;
import com.hyh.base_library.component.login.adapter.LoginServiceAdapter;

public class MainActivity extends AppCompatActivity {
    private TextView mTvSkipLogin;
    private TextView mTvSkipCore;
    private LoginServiceAdapter mLoginServiceAdapter = new LoginServiceAdapter();
    private CoreServiceAdapter mCoreServiceAdapter = new CoreServiceAdapter();

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
                CoreServiceAdapter coreServiceAdapter = new CoreServiceAdapter();
                //跳转到core组件
                mCoreServiceAdapter.skipToCoreActivity(MainActivity.this);
            }
        });
    }
}
