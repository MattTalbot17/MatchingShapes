package com.matchingshapesdemo;

import android.graphics.drawable.Drawable;

public class Shape
{
    String shape_Name;
    Drawable shape_Resource;

    public String getShape_Name() {
        return shape_Name;
    }

    public void setShape_Name(String shape_Name) {
        this.shape_Name = shape_Name;
    }

    public Drawable getShape_Resource() {
        return shape_Resource;
    }

    public void setShape_Resource(Drawable shape_Resource) {
        this.shape_Resource = shape_Resource;
    }



    public Shape(String shape_Name, Drawable shape_Resource) {
        this.shape_Name = shape_Name;
        this.shape_Resource = shape_Resource;
    }


}
