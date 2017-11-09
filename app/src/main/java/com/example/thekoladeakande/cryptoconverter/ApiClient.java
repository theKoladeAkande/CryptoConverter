package com.example.thekoladeakande.cryptoconverter;

/**
 * Created by thekoladeakande on 11/5/17.
 */
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


    public class ApiClient {

        public static final String BASE_URL = "https://min-api.cryptocompare.com";
        private static Retrofit retrofit = null;


        public static Retrofit getClient() {
            if (retrofit==null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }



