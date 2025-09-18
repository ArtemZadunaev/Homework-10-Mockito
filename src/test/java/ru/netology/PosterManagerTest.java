package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    Movie movie1 = new Movie(1, "Star Wars 1 ", 2001, 240);
    Movie movie2 = new Movie(2, "Star Wars 2 ", 2003, 215);
    Movie movie3 = new Movie(3, "Star Wars 3 ", 2005, 232);
    Movie movie4 = new Movie(4, "Star Wars 4 ", 1978, 212);
    Movie movie5 = new Movie(5, "Star Wars 5 ", 1980, 196);
    Movie movie6 = new Movie(6, "Star Wars 6 ", 1982, 199);
    PosterManager manager = new PosterManager(3);

    @BeforeEach
    public void setup() {
        manager.saveMovie(movie1);
        manager.saveMovie(movie2);
        manager.saveMovie(movie3);
        manager.saveMovie(movie4);
        manager.saveMovie(movie5);
        manager.saveMovie(movie6);
    }

    @Test
    void shouldSaveMovie() {
        manager.saveMovie(movie1);
        manager.saveMovie(movie2);
        manager.saveMovie(movie3);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, manager.findAll());
    }


    @Test
    void shouldFindAll() {
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};

        Assertions.assertArrayEquals(expected, manager.findAll());

    }

    @Test
    void findLast3() {
        Movie[] expected = {movie6, movie5, movie4};

        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void findLast5() {
        PosterManager defaultManager = new PosterManager();

        defaultManager.saveMovie(movie1);
        defaultManager.saveMovie(movie2);
        defaultManager.saveMovie(movie3);


        Movie[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, defaultManager.findLast());
    }
}