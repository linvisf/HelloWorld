package com.linvisf.presenter.impl;

import com.linvisf.presenter.BasePresenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public class BasePresenterImpl implements BasePresenter {

    private CompositeSubscription mSubscription;

    protected void addSubscription(Subscription s) {
        if (this.mSubscription == null) {
            this.mSubscription = new CompositeSubscription();
        }
        this.mSubscription.add(s);
    }

    @Override
    public void unSubscribe() {
        if (this.mSubscription != null) {
            this.mSubscription.unsubscribe();
        }
    }
}
