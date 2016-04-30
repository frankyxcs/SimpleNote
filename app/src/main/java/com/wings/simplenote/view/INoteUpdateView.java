package com.wings.simplenote.view;

import com.wings.simplenote.model.domain.Note;

/**
 * Created by wing on 2016/4/29.
 */
public interface INoteUpdateView {
    void showProcess();

    void dismissProcess();

    void updateViews(Note noteItem);

}