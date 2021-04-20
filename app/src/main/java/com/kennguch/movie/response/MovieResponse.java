package com.kennguch.movie.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kennguch.movie.model.MovieModel;

//Single movie request
public class MovieResponse {

    // 1 finding the movie object

    @SerializedName("results")
    @Expose()
    private MovieModel movie;

    public MovieModel getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movie=" + movie +
                '}';
    }
}
