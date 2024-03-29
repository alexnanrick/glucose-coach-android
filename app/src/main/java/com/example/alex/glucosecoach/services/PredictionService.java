package com.example.alex.glucosecoach.services;

import com.example.alex.glucosecoach.models.Fact;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by alex on 2/27/17.
 */

public interface PredictionService {
    @POST("predict/{username}")
    Call<Double> getPrediction(@Body Fact fact, @Path("username") String username);

    @GET("train/{username}")
    Call<Void> trainModel(@Path("username") String username);
}
