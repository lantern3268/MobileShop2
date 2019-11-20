package com.huatec.edu.mobileshop.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by lantern on 2019/10/11.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        initView();
        initData();
    }

    protected void initData(){

    }

    protected void initView(){

    }

    public abstract int getContentViewId();

    public void toastShort(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void toastLong(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    
}
