package com.linvisf.presenter.implView;

import com.linvisf.data.bean.GanBean;

import java.util.List;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public interface INewsView extends IBaseView{

    void setAdapter(List<GanBean> list);
}
