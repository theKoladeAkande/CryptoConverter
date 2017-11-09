package com.example.thekoladeakande.cryptoconverter;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

@GET("/data/price")
    Call<CurrencyValue> getValue(@Query("fsym") String fsym,@Query("tsyms") String tsyms);
}
