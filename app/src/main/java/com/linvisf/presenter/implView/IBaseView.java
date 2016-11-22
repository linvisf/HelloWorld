package com.linvisf.presenter.implView;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public interface IBaseView {

    void showProgressDialog();

    void hideProgressDialog();

    void showError(String errorMsg);
}
