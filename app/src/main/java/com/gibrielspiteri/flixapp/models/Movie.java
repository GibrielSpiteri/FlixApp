package com.gibrielspiteri.flixapp.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Movie {

    String posterPath;
    String title;
    String overview;
    String backdrop;
    double rating;
    int movieId;
    public Movie() {
    }

    public Movie(JSONObject json) throws JSONException {
        posterPath = json.getString("poster_path");
        title = json.getString("title");
        overview = json.getString("overview");
        backdrop = json.getString("backdrop_path");
        rating = json.getDouble("vote_average");
        movieId = json.getInt("id");
    }

    public static List<Movie> fromJsonArray(JSONArray json) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for(int i = 0; i < json.length(); i++){
            movies.add(new Movie(json.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath);
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w300/%s", backdrop);
    }
    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public double getRating() {
        return rating;
    }

    public int getMovieId() {
        return movieId;
    }
}
