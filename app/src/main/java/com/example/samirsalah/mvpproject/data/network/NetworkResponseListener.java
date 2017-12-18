package com.example.samirsalah.mvpproject.data.network;

/**
 * Created by ahmed agamy on 04/04/2017.
 */

public interface NetworkResponseListener<T> {

    void networkOperationSuccess(NetworkResponse<T> networkResponse);

    void networkOperationFail(Throwable throwable);
}
