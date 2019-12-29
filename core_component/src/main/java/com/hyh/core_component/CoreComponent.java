package com.hyh.core_component;
import com.hyh.base_library.component.core.ICoreComponent;
import com.hyh.base_library.component.core.service.ICoreService;

public class CoreComponent implements ICoreComponent {

    @Override
    public ICoreService getCoreService() {
        return new CoreService();
    }
}
