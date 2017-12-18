package com.example.samirsalah.mvpproject.ui.screens.retrofit;

import android.widget.Toast;

import com.example.samirsalah.mvpproject.data.model.Register;
import com.example.samirsalah.mvpproject.data.network.MainApi;
import com.example.samirsalah.mvpproject.data.network.MainApiHelper;
import com.example.samirsalah.mvpproject.data.network.NetworkResponse;
import com.example.samirsalah.mvpproject.data.network.NetworkResponseListener;
import com.example.samirsalah.mvpproject.ui.screens.MainPresenter;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by samir.salah on 12/17/2017.
 */

public class RetrofitPresenter extends MainPresenter<RetrofitView> implements NetworkResponseListener<Register> {

    void populatList(String fullName, String password, String email, String mobile,
                     String photo, String companyName, String position,
                     String deviceId, String pnToken , boolean isVerified) {

        try {
            JSONObject registerBody = MainApiHelper.createRegisterBody(fullName, password, email,
                    mobile, photo, position,
                    true);
            MainApi.getUser(registerBody,this);

//            MainApi.getUser(registerBody, new NetworkResponseListener<UserData>() {
//                @Override
//                public void networkOperationSuccess(NetworkResponse<UserData> networkResponse) {
//                    if (isDetachView()) return;
//                    dialogsLoading.dismiss();
//                    UserData userNetworkData = (UserData) networkResponse.data;
//                    int errorCode = userNetworkData.ISResultHasData;
//                    if (errorCode == 1) {
//                        saveUserData(userNetworkData.user);
//                        ATCPrefManager.setIsUserLoggedIn(mContext, true);
//                        view.openCouncilActivity();
//                    } else {
//                        networkOperationFail(new Throwable(userNetworkData.user.Message));
//                    }
//                }
//
//                @Override
//                public void networkOperationFail(Throwable throwable) {
////                    view.dismissLoadingProgress();
//                    dialogsLoading.dismiss();
//                    if (throwable.getMessage()==null || throwable.getMessage().equals("")){
//                        Toast.makeText(context, "Please Try again later..", Toast.LENGTH_SHORT).show();
//                    }else {
//                        Toast.makeText(context, throwable.getMessage()+"", Toast.LENGTH_SHORT).show();
//                    }
//
////                    view.showErrorDialog(R.string.email_exist);
//
//                }
//            });
        } catch (JSONException e) {
            e.printStackTrace();
//            view.dismissLoadingProgress();
//            dialogsLoading.dismiss();
        }
    }

    @Override
    public void networkOperationSuccess(NetworkResponse<Register> networkResponse) {
        Register userNetworkData = (Register) networkResponse.data;
                    int errorCode = userNetworkData.getISResultHasData();

                        view.update();
    }

    @Override
    public void networkOperationFail(Throwable throwable) {

    }
}
