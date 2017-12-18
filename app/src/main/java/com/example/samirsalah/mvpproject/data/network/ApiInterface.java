package com.example.samirsalah.mvpproject.data.network;

import com.example.samirsalah.mvpproject.data.model.Register;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by samir.salah on 12/17/2017.
 */

public interface ApiInterface {

    @POST("User/Register")
    Observable<Register> registerUser(@Body RequestBody body);

    @GET("User/Profile/{id}")
    Observable<Register> getProfile(@Path("id") String id);
}
