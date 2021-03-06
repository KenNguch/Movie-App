package com.kennguch.movie.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {

    //Model class for the movie

    private String title;
    private String poster_path;
    private String release_date;
    private String movie_overview;
    private int movie_id;
    private float vote_average;
//Contructor


    public MovieModel(String title, String poster_path, String release_date, String movie_overview, int movie_id, float vote_average) {
        this.title = title;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.movie_overview = movie_overview;
        this.movie_id = movie_id;
        this.vote_average = vote_average;
    }

    //Getters

    protected MovieModel(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        movie_overview = in.readString();
        movie_id = in.readInt();
        vote_average = in.readFloat();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getMovie_overview() {
        return movie_overview;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public float getVote_average() {
        return vote_average;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(poster_path);
        dest.writeString(release_date);
        dest.writeString(movie_overview);
        dest.writeInt(movie_id);
        dest.writeFloat(vote_average);
    }
}
