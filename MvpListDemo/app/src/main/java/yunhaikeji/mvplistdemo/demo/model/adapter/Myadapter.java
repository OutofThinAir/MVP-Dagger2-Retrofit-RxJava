package yunhaikeji.mvplistdemo.demo.model.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import yunhaikeji.mvplistdemo.demo.model.bean.CartBean;

/**
 * Use:
 * Author:陈懿鹏
 * Data:2017/5/13.
 */

public class Myadapter  extends BaseAdapter{
    private Context context;
    private ArrayList<CartBean.CartItemListBean> list;

    public Myadapter(Context context, ArrayList<CartBean.CartItemListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
    private class MyviewHolder{

    }
}
