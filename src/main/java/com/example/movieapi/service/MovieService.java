package com.example.movieapi.service;

import com.example.movieapi.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public Movie addMovie(Movie movie) {
        movie.setId(counter.incrementAndGet());
        movies.add(movie);
        return movie;
    }

    public Movie getMovieById(Long id) {
        return movies.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public List<Movie> getAllMovies() {
        return movies;
    }

}
