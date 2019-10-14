package com.sy;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * @ data  2019/10/10 10:46
 * @ author  zxcg
 */
public class TestUtils {
    public TestUtils() {
    }

    public TestUtils(Context context) {
        Toast.makeText(context, "TestUtils ", Toast.LENGTH_SHORT).show();
    }
    public void print(){
        for (int i=0;i<10;i++){
            Log.e("tag",i+"  print");
        }
    }
}
