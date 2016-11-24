package com.linvisf.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public class ToastUtil {

    public static void showMessage(Context context, int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }

    protected void showMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
