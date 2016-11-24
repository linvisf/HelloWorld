package com.linvisf.presenter.impl;

import com.linvisf.api.ApiService;
import com.linvisf.data.GanData;
import com.linvisf.presenter.INewsPresenter;
import com.linvisf.presenter.implView.INewsView;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public class NewsPresenterImpl extends BasePresenterImpl implements INewsPresenter {

    private INewsView mView;

    public NewsPresenterImpl(INewsView view) {
        mView = view;
    }

    @Override
    public void getNewsData(int page) {
        Subscription subscription = ApiService.getInstance().getApiService().getAllData(page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GanData>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(GanData ganData) {
                        mView.setAdapter(ganData.getResults());
                    }
                });
        addSubscription(subscription);
    }

    @Override
    public void unSubscribe() {

    }
}
