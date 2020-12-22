package com.example.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class WebAppInterface {
    Context mContext;
    View view;
    private LinearLayout linearId;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c, View v) {
        mContext = c;
        view = v;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showSnackbarAdd(String snackbar) {
        Snackbar.make(view, "Selecciono la opcion SUMA", Snackbar.LENGTH_LONG).show();
    }

    @JavascriptInterface
    public void showSnackbarSub(String snackbar) {
        Snackbar.make(view, "Selecciono la opcion RESTA", Snackbar.LENGTH_LONG).show();
    }

    @JavascriptInterface
    public void showSnackbarMul(String snackbar) {
        Snackbar.make(view, "Selecciono la opcion MULTIPLICACION", Snackbar.LENGTH_LONG).show();
    }

    @JavascriptInterface
    public void showSnackbarDiv(String snackbar) {
        Snackbar.make(view, "Selecciono la opcion DIVISION", Snackbar.LENGTH_LONG).show();
    }

    @JavascriptInterface
    public void showSnackbarReset(String snackbar) {
        Snackbar.make(view, "Se vaciaron los cambios", Snackbar.LENGTH_LONG).show();
    }

}
