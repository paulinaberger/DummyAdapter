package org.android.mdsd2016.android.dummyadapter;

import android.content.ClipData;
import android.content.Context;

import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by paulinaberger on 2017-03-13.
 */

//you want classes to be POJO (playing all java objects) - make them as simple as possible
public class item {

    private String mImagePath;
    private String mTitle;
    private String mBody;

    public item(String imagePath, String title, String mBody){
        this.mImagePath = imagePath;
        this.mTitle = title;
        this.mBody = mBody;
    }

    public String getmImagePath() {
        return mImagePath;
    }
    public void setImagePath(String imagePath){
        this.mImagePath = imagePath;
    }

    public String getmTitle()
    { return mTitle;
    }

    public void setmTitle(String Title){
        this.mTitle = Title;
    }

    public String getBody() {

        return  mBody; }

    public void setBody(String Body){
        this.mBody = Body;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item(");
        sb.append("mImagePath = '").append(mImagePath).append('\'');
        sb.append(", mTitle='").append(mTitle).append('\'');
        sb.append(", mBody='").append(mBody).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
