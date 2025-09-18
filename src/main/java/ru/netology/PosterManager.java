package ru.netology;

public class PosterManager {
    private int numberOfLastMovies;
    private Movie[] moviesRepo = new Movie[0];

    public PosterManager() {
        this.numberOfLastMovies = 5;
    }

    public PosterManager(int numberOfLastMovies) {
        this.numberOfLastMovies = numberOfLastMovies;
    }

    public void saveMovie(Movie movie) {

        Movie[] tmp = new Movie[moviesRepo.length + 1];
        for (int i = 0; i < moviesRepo.length; i++) {
            tmp[i] = moviesRepo[i];
        }
        tmp[tmp.length - 1] = movie;
        moviesRepo = tmp;
    }


    public Movie[] findAll() {
        return moviesRepo;
    }

    public Movie[] findLast() {
        Movie[] tmp = new Movie[moviesRepo.length <= numberOfLastMovies ? moviesRepo.length : numberOfLastMovies];
        int counter = moviesRepo.length - 1;
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = moviesRepo[counter];
            counter--;
        }
        return tmp;

    }


}
