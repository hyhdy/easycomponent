package com.hyh.core_component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hyh.base_library.component.login.adapter.LoginServiceAdapter;

public class CoreActivity extends AppCompatActivity {
    private LoginServiceAdapter mLoginServiceAdapter = new LoginServiceAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        findViewById(R.id.tv_skip_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginServiceAdapter.skipToLoginActivity(CoreActivity.this);
            }
        });
    }
}
