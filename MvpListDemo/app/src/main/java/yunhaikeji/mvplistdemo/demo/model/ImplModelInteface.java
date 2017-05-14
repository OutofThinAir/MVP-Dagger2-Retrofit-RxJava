package yunhaikeji.mvplistdemo.demo.model;

import android.util.Log;

import java.util.ArrayList;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import yunhaikeji.mvplistdemo.demo.model.bean.CartBean;
import yunhaikeji.mvplistdemo.demo.model.url_interface.UrlInterface;
import yunhaikeji.mvplistdemo.demo.presenter.ImplPreInterface;
import yunhaikeji.mvplistdemo.demo.presenter.PresenterInterface;
import yunhaikeji.mvplistdemo.demo.presenter.dagger2_component.DaggerPresenterComponent;


/**
 * Use:Model 的实现类
 * Author:陈懿鹏
 * Data:2017/5/12.
 */

public class ImplModelInteface implements ModelInteface {

    @Inject
    PresenterInterface preInterface;

//    //通过构造器传值
//
//    public ImplModelInteface(PresenterInterface preInterface) {
//        this.preInterface = preInterface;
//    }
    {

    }

    //http://169.254.217.5:8080
    @Override
    public void getCartItemList() {

        //日志拦截器打印日志
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(final String message) {
                //打印retrofit日志
                Log.i("RetrofitLog", "retrofitBack = " + message);


            }
        });
        //设置log的级别
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //将网络请求交给OkHttp
        OkHttpClient client = new OkHttpClient.Builder().build();
        //实例化Retrofit2
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl("http://169.254.217.5:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        //调用请求接口
       UrlInterface urlInterface= retrofit.create(UrlInterface.class);

        //执行请求方法
        Observable<CartBean> observable = urlInterface.getCartBean("26");

        //给被观察者设置线程
        observable.subscribeOn(Schedulers.io())
                //回调线程(观察者)
                .observeOn(AndroidSchedulers.mainThread())
                //变换
                .map(new Func1<CartBean, CartBean>() {
                    @Override
                    public CartBean call(CartBean cartBean) {
                        return cartBean;
                    }
                    //订阅观察者
                }).subscribe(new Observer<CartBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            //获得数据
            @Override
            public void onNext(CartBean cartBean) {
                DaggerPresenterComponent.create().inject(ImplModelInteface.this);

                //将数据传给p层
                preInterface.getDataFromModle(cartBean);
            }
        });



    }
}
