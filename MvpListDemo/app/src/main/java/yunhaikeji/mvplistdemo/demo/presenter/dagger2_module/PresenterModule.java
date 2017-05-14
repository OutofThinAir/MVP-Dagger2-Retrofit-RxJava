package yunhaikeji.mvplistdemo.demo.presenter.dagger2_module;

import dagger.Module;
import dagger.Provides;
import yunhaikeji.mvplistdemo.demo.presenter.ImplPreInterface;
import yunhaikeji.mvplistdemo.demo.presenter.PresenterInterface;
import yunhaikeji.mvplistdemo.demo.view.activity.MainActivity;
import yunhaikeji.mvplistdemo.demo.view.view_interface.ViewInterface;

/**
 * Use:dagger2_Module
 * Author:陈懿鹏
 * Data:2017/5/12.
 */
@Module
public class PresenterModule {

     @Provides
    ViewInterface getViewInterface(){
        return new MainActivity();
    }

    //提供对象
    @Provides
    PresenterInterface getImplPreInterface(ViewInterface viewInterface){
        return new ImplPreInterface(viewInterface);
    }
}
