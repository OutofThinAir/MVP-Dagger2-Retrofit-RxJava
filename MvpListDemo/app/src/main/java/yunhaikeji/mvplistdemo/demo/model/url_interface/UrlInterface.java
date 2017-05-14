package yunhaikeji.mvplistdemo.demo.model.url_interface;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import yunhaikeji.mvplistdemo.demo.model.bean.CartBean;

/**
 * Use:Retrofit2 请求接口
 * Author:陈懿鹏
 * Data:2017/5/12.
 */

public interface UrlInterface {
    @GET("bullking1/cart")
    Observable<CartBean> getCartBean(@Query("userID") String uid);
}
