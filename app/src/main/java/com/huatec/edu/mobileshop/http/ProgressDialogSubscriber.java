package com.huatec.edu.mobileshop.http;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import rx.Subscriber;

public class ProgressDialogSubscriber<T> extends Subscriber<T> {

    private final Context mContext;
    private ProgressDialog mDialog;

    public ProgressDialogSubscriber(Context context){this.mContext=context;}

    @Override
    public void onCompleted() {
        dismissProgressDialog();
    }

    @Override
    public void onError(Throwable e) {
        if(e instanceof SocketTimeoutException){
            Toast.makeText(mContext,"网络中断，请检查你的网络状态", Toast.LENGTH_SHORT).show();
        }else if (e instanceof ConnectException){
            Toast.makeText(mContext,"网络中断，请检查您的网络状态", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(mContext,"error:"+e.getMessage(), Toast.LENGTH_SHORT).show();
            System.out.println("error:"+e.getMessage());
        }dismissProgressDialog();
    }

    @Override
    public void onNext(T t) {

    }

    private void dismissProgressDialog(){
        if (mDialog!=null&&mDialog.isShowing()){
            mDialog.dismiss();
            mDialog=null;
        }
    }//加载好后隐藏进度条

    @Override
    public void onStart() {
        super.onStart();
        showProgressDialog();
    }

    private void showProgressDialog(){
        if (mDialog==null){
            mDialog = new ProgressDialog(mContext);
            mDialog.setCancelable(true);
            mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialogInterface) {
                    //取消订阅
                    ProgressDialogSubscriber.this.unsubscribe();
                }
            });
        }if (mDialog!=null&&mDialog.isShowing()){
            mDialog.show();
        }
    }//显示进度条
}
