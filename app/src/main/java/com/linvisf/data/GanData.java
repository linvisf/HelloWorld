package com.linvisf.data;

import com.linvisf.data.bean.GanBean;

import java.util.List;

/**
 * Created by linhong on 2016/11/23.
 * <p>
 * 描述：
 */

public class GanData extends BaseData {

    private List<GanBean> results;

    public List<GanBean> getResults() {
        return results;
    }

    public void setResults(List<GanBean> results) {
        this.results = results;
    }
}
