package com.wings.simplenote.listener;

/**
 * Created by wing on 2016/4/28.
 */
public interface OnDatePickListener {
    void onDatePick(int year, int monthOfYear, int dayOfMonth);

    void onDatePickCancel();
}
