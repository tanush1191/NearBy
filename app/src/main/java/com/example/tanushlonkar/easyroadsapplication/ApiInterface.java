package com.example.tanushlonkar.easyroadsapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tanush.lonkar on 18-08-2017.
 */
public interface ApiInterface
{
    @GET("place/nearbysearch/json?")
    Call<PlacesPOJO.Root> doPlaces(@Query(value = "type", encoded = true) String type, @Query(value = "location", encoded = true) String location, @Query(value = "radius", encoded = true) String radius, @Query(value = "name", encoded = true) String name, @Query(value = "opennow", encoded = true) boolean opennow, @Query(value = "key", encoded = true) String key);


    @GET("distancematrix/json") // origins/destinations:  LatLng as string
    Call<ResultDistanceMatrix> getDistance(@Query("key") String key, @Query("origins") String origins, @Query("destinations") String destinations);
}
