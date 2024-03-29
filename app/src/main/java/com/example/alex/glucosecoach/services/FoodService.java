package com.example.alex.glucosecoach.services;

import com.example.alex.glucosecoach.models.Food;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by alex on 3/7/17.
 */

public interface FoodService {
    @GET("foods")
    Observable<List<Food>> getFoodsObservable();
}
