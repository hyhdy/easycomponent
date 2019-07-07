package com.hyh.core_component;

import com.hyh.base_library.ComServiceFactory;
import com.hyh.base_library.compoService.IAppComponent;

public class CoreComponent implements IAppComponent {
    @Override
    public void initialize() {
        ComServiceFactory.getInstance().setCoreService(new CoreService());
    }
}
