package com.hyh.core_component;

import android.content.Context;
import android.content.Intent;
import com.hyh.base_library.component.core.service.ICoreService;

public class CoreService implements ICoreService {
    @Override
    public void skipToCoreActivity(Context context) {
        Intent intent = new Intent(context,CoreActivity.class);
        context.startActivity(intent);
    }
}
