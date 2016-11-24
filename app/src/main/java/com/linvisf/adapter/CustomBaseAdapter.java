package com.linvisf.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：通用适配器
 */
public abstract class CustomBaseAdapter<T> extends BaseAdapter {

    private Context mContext;
    private List<T> mList;
    protected LayoutInflater mInflater;

    public CustomBaseAdapter(Context context, List<T> list) {
        this.mContext = context;
        this.mList = list;
        mInflater = LayoutInflater.from(context);
    }

    public CustomBaseAdapter(Context context, T[] array) {
        this.mContext = context;
        this.mList = Arrays.asList(array);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return bindView(position, convertView, parent);
    }

    public abstract View bindView(int position, View convertView, ViewGroup parent);

    public void setList(List<T> list) {
        if (this.mList != null) {
            this.mList.clear();
        }
        this.mList = list;
        notifyDataSetChanged();
    }

    public List<T> getList(){
        return mList;
    }

    public void insert(T object, int index) {
        this.mList.add(index, object);
        this.notifyDataSetChanged();
    }

    public void remove(T object) {
        this.mList.remove(object);
        this.notifyDataSetChanged();
    }

}
