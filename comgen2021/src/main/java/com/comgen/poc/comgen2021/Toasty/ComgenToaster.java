package com.comgen.poc.comgen2021.Toasty;

import android.content.Context;
import android.widget.Toast;

public class ComgenToaster {
    public static void comgenToasty(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
