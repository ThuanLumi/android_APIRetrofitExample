package com.office.apiretrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
   private static Retrofit INSTANCE;
   private static final String BASE_URL = "https://reqres.in/";

   public static Retrofit getRetrofitInstance() {
      if (INSTANCE == null) {
         INSTANCE = new Retrofit.Builder()
                 .baseUrl(BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();
      }
      return INSTANCE;
   }
}
