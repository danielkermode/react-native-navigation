package com.reactnativenavigation.params;

import android.graphics.drawable.Drawable;

import java.util.List;

public class FabParams {
    public Drawable collapsedIcon;
    public Drawable expendedIcon;
    public StyleParams.Color backgroundColor;
    public String id;
    public String navigatorEventId;
    public List<FabActionParams> actions;

    public boolean hasExpendedState() {
        return actions != null && actions.size() > 0;
    }
}