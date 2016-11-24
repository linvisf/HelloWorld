package com.linvisf.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linvisf.R;
import com.linvisf.data.bean.GanBean;

import java.util.List;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public class NewsAdapter extends CustomBaseAdapter<GanBean>{

    public NewsAdapter(Context context, List<GanBean> list) {
        super(context, list);
    }

    @Override
    public View bindView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_news, parent, false);
        }
        TextView tv_title = ViewHolder.getView(convertView, R.id.tv_title);

        GanBean bean = (GanBean) getItem(position);

        tv_title.setText(bean.getDesc());
        return convertView;
    }
}
