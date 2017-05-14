package yunhaikeji.mvplistdemo.demo.presenter.dagger2_component;

import dagger.Component;
import yunhaikeji.mvplistdemo.demo.model.ImplModelInteface;
import yunhaikeji.mvplistdemo.demo.presenter.dagger2_module.PresenterModule;

/**
 * Use:
 * Author:陈懿鹏
 * Data:2017/5/12.
 */
@Component(modules = PresenterModule.class)
public interface PresenterComponent {
    void inject(ImplModelInteface implModelInteface);
}
