package com.hyh.core_component;

import android.content.Context;
import android.content.Intent;

import com.hyh.base_library.compoService.ICoreCompoService;

public class CoreService implements ICoreCompoService {
    @Override
    public void skipToCoreActivity(Context context) {
        Intent intent = new Intent(context,CoreActivity.class);
        context.startActivity(intent);
    }
}
