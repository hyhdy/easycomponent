package com.hyh.base_library.component;

import com.hyh.base_library.component.core.ICoreComponent;
import com.hyh.base_library.component.login.ILoginComponent;

/**
 * created by curdyhuang on 2019-11-04
 */
public interface IComponentFactory {
    ILoginComponent createLoginComponent();

    ICoreComponent createCoreComponent();
}
