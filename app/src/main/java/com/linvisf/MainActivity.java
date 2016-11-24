package com.linvisf;

import android.os.Bundle;
import android.widget.ListView;

import com.linvisf.adapter.NewsAdapter;
import com.linvisf.base.BaseActivity;
import com.linvisf.data.bean.GanBean;
import com.linvisf.presenter.INewsPresenter;
import com.linvisf.presenter.impl.NewsPresenterImpl;
import com.linvisf.presenter.implView.INewsView;

import java.util.List;

public class MainActivity extends BaseActivity implements INewsView {

    private ListView lv_news;
    private INewsPresenter mPresenter;
    private NewsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_news = (ListView) findViewById(R.id.lv_news);

        mPresenter = new NewsPresenterImpl(this);
        mPresenter.getNewsData(1);
    }

    @Override
    public void setAdapter(List<GanBean> list) {
        mAdapter = new NewsAdapter(this, list);
        lv_news.setAdapter(mAdapter);
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }

    @Override
    public void showError(String errorMsg) {

    }
}
