package yunhaikeji.mvplistdemo.demo.model.dagger2_component;

import dagger.Component;
import yunhaikeji.mvplistdemo.demo.model.dagger2_module.ModelModule;
import yunhaikeji.mvplistdemo.demo.presenter.ImplPreInterface;

/**
 * Use:
 * Author:陈懿鹏
 * Data:2017/5/12.
 */
@Component(modules = ModelModule.class)

public interface ModelComponent {

    void inject1(ImplPreInterface implPreInterface);
}
