package com.example.administrator.vebview_activity_demo;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.lsh.XXRecyclerview.XXRecycleView;

/**
 * Created by Administrator on 2017/4/1.
 */

public class JavascriptInterface {

    private Context context;


    public JavascriptInterface(Context context) {
        this.context = context;
    }

    @android.webkit.JavascriptInterface
    public void openImage(String img) {
        Intent intent = new Intent();
        intent.putExtra("img", img);
        intent.setClass(context, XXreActivity.class);
        context.startActivity(intent);
        Toast.makeText(context, img, Toast.LENGTH_SHORT).show();
    }
}