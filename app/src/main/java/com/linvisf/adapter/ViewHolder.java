package com.linvisf.adapter;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public class ViewHolder {

    public static <T extends View> T getView(View convertView, int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            convertView.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = convertView.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }
}
