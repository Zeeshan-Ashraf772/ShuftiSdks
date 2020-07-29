package com.example.shuftipro_complete_sdk;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Verification {

    public static void fun(Context context,String message)
    {
        Intent intent=new Intent(context,Consent_Screen.class);
        context.startActivity(intent);
    }

}
