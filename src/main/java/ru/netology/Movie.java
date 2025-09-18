package ru.netology;

public class Movie {
    private int movieId;
    private String name;
    private int year;
    private int duration;

    public Movie(int movieId, String name, int year, int duration) {
        this.movieId = movieId;
        this.name = name;
        this.year = year;
        this.duration = duration;
    }
}
