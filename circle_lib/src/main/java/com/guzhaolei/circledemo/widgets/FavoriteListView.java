package com.guzhaolei.circledemo.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.guzhaolei.circledemo.adapter.FavoriteListAdapter;
import com.guzhaolei.circledemo.spannable.ISpanClick;

/**
 * @author guzhaolei
 * @Description:
 * @date 16/1/2 18:47
 */
public class FavoriteListView extends TextView{
    private ISpanClick mSpanClickListener;

    public void setSpanClickListener(ISpanClick listener){
        mSpanClickListener = listener;
    }
    public ISpanClick getSpanClickListener(){
        return  mSpanClickListener;
    }

    public FavoriteListView(Context context) {
        super(context);
    }

    public FavoriteListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FavoriteListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setAdapter(FavoriteListAdapter adapter){
        adapter.bindListView(this);
    }

}
