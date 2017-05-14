package yunhaikeji.mvplistdemo.demo.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import yunhaikeji.mvplistdemo.demo.R;
import yunhaikeji.mvplistdemo.demo.model.ImplModelInteface;
import yunhaikeji.mvplistdemo.demo.model.bean.CartBean;
import yunhaikeji.mvplistdemo.demo.presenter.ImplPreInterface;
import yunhaikeji.mvplistdemo.demo.view.view_interface.ViewInterface;

public class MainActivity extends AppCompatActivity implements ViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImplPreInterface preInterface =new ImplPreInterface(this);
      preInterface.setDataToView();
    }

    @Override
    public void showDataForView(CartBean cartBean) {
        Log.d("MainActivity----->",cartBean.toString());

    }
}
