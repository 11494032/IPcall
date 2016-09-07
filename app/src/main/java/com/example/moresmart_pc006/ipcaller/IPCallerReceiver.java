package com.example.moresmart_pc006.ipcaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by MoreSmart-PC006 on 2016/9/7.
 */
public class IPCallerReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {

        String resutleDate = getResultData();
        Log.d("tag","接收广播"+resutleDate);
        SharedPreferences sp = context.getSharedPreferences("config",Context.MODE_PRIVATE);

        String ipNum = sp.getString( "ip","17951" );

        if(!TextUtils.isEmpty(ipNum ))
        {
            resutleDate = ipNum+resutleDate;
        }

        setResultData(resutleDate);

    }
}
