package com.tyza66.kuangkuangguang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;

public class LocalJavaForJs {
    Context context;
    SQLiteDatabase db;
    WebView webView;
    public LocalJavaForJs(Context context, WebView webView, SQLiteDatabase db){
       this.context =  context;
       this.db = db;
       this.webView = webView;
    }
    @JavascriptInterface
    public void test(){
        Toast.makeText(context,"test",Toast.LENGTH_SHORT).show();
    }
}
