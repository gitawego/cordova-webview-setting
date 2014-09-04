package com.darktalker.cordova.viewportfix;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;



public class ViewportFix extends CordovaPlugin {
    private CordovaWebView webView;
    @Override
    public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
        Log.d("ViewportFix", "set viewport");
        this.webView = webView;
        super.initialize(cordova, webView); 
        
    }
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if ("fixme".equals(action)) {
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    webView.getSettings().setLoadWithOverviewMode(true);
                    webView.getSettings().setUseWideViewPort(true);
                    
                    webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                    callbackContext.success();
                }
            });
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }
}
