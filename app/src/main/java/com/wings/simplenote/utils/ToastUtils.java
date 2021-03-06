package com.wings.simplenote.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wing on 2015/9/11.
 */
public class ToastUtils {
    private static Toast mToast;
    //单例吐司,直接覆盖前一个,不再挨个执行
    public static void showToast(Context mContext, String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }
}
