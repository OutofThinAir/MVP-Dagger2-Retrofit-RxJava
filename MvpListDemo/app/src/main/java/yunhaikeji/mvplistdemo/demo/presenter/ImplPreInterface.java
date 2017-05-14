package yunhaikeji.mvplistdemo.demo.presenter;

import javax.inject.Inject;

import yunhaikeji.mvplistdemo.demo.model.ImplModelInteface;
import yunhaikeji.mvplistdemo.demo.model.ModelInteface;
import yunhaikeji.mvplistdemo.demo.model.bean.CartBean;
import yunhaikeji.mvplistdemo.demo.model.dagger2_component.DaggerModelComponent;
import yunhaikeji.mvplistdemo.demo.view.view_interface.ViewInterface;

/**
 * Use:
 * Author:陈懿鹏
 * Data:2017/5/12.
 */

public class ImplPreInterface implements PresenterInterface{
    //声明v层对象
    ViewInterface viewInterface;
    @Inject
    ModelInteface modelInteface;
    //传值


    public ImplPreInterface(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;

        DaggerModelComponent.create().inject1(this);

    }

    @Override
    public void getDataFromModle(CartBean cartBean) {
           viewInterface.showDataForView(cartBean);
    }

    @Override
    public void setDataToView() {
        modelInteface.getCartItemList();
    }
}
