package com.fs.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class performs sum called from JavaScript.
 */
public class Sample extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("sumup")) {
            Integer num1 = args.getInt(0);
            Integer num2 = args.getInt(1);
            this.sumup(num1, num2, callbackContext);
            return true;
        }
        return false;
    }

    private void sumup(Integer num1, Integer num2, CallbackContext callbackContext) {
        if(num1 != null && num2 != null) {
            callbackContext.success(num1 * num2);
        } else {
            callbackContext.error("Expected two integer arguments.");
        }
    }
}
