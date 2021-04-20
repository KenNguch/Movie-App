package com.kennguch.movie.request;

import com.kennguch.movie.utils.Credentials;
import com.kennguch.movie.utils.MovieApi;

import retrofit2.Retrofit;

public class Servicey {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(Credentials.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();


    private static MovieApi movieApi = retrofit.create(MovieApi.class);


    public MovieApi getMovieApi() {
        return movieApi;
    }

}
