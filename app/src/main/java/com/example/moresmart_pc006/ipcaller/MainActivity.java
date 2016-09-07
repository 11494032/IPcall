package com.example.moresmart_pc006.ipcaller;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText et_ip = null;
    private  SharedPreferences sp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ip = (EditText) findViewById( R.id.et_ip );

        sp = getSharedPreferences( "config", MODE_PRIVATE );
    }

    public void saveIp( View view )
    {
        String ipNum = et_ip.getText().toString().trim();
        System.out.println("ipnum = "+ipNum);
        if(TextUtils.isEmpty( ipNum ))
        {
            System.out.println("ipnum = "+ipNum);
           sp.edit().putString("ip", "17951").commit();
        }
        else
        {
            System.out.println("ipnum2 = "+ipNum);
           sp.edit().putString("ip", ipNum).commit();
        }
        Toast.makeText(this,"IP号码保存成功",Toast.LENGTH_SHORT).show();
    }

}
