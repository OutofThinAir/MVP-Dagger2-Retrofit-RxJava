package yunhaikeji.mvplistdemo.demo.model.dagger2_module;

import dagger.Module;
import dagger.Provides;
import yunhaikeji.mvplistdemo.demo.model.ImplModelInteface;
import yunhaikeji.mvplistdemo.demo.model.ModelInteface;

/**
 * Use:dagger2_Module
 * Author:陈懿鹏
 * Data:2017/5/12.
 */
@Module
public class ModelModule {

    //提供对象
    @Provides
    ModelInteface getImplModelInteface(){
        return new ImplModelInteface();
    }
}
