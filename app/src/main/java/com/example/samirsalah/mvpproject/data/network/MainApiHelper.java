package com.example.samirsalah.mvpproject.data.network;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by samir.salah on 12/17/2017.
 */

public class MainApiHelper {

    public static JSONObject createRegisterBody(String fullName, String password, String email, String mobile,
                                                String photo, String position
                                                 , boolean isVerified) throws JSONException {
        JSONObject body = new JSONObject();
        body.put("Name", fullName);
        body.put("Password", password);
        body.put("Phone", mobile);
        body.put("Email", email);
        body.put("Photo", photo);
//        body.put("Company", companyName);
        body.put("Position", position);
//        body.put("DeviceID", deviceId);
//        body.put("DeviceToken", pnToken);
        body.put("IsPhoneVerfied", isVerified);

        return body;
    }
}
