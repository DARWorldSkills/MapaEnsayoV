package com.aprendiz.ragp.ensayoruta;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SLugares {
    @GET("json")
    Call<ResponseBody> getRutas(@Query("origin") String origen, @Query("destination") String destination);
}
