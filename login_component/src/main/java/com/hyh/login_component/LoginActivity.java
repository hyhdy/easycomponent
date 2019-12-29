package com.hyh.login_component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hyh.base_library.component.core.adapter.CoreServiceAdapter;

public class LoginActivity extends AppCompatActivity {
    private CoreServiceAdapter mCoreServiceAdapter = new CoreServiceAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.tv_skip_core).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCoreServiceAdapter.skipToCoreActivity(LoginActivity.this);
            }
        });
    }
}
