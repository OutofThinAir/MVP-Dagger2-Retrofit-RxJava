package yunhaikeji.mvplistdemo.demo.presenter;

import yunhaikeji.mvplistdemo.demo.model.bean.CartBean;

/**
 * Use:
 * Author:陈懿鹏
 * Data:2017/5/12.
 */

public interface PresenterInterface {
    void getDataFromModle(CartBean cartBean);
    void setDataToView();

}
