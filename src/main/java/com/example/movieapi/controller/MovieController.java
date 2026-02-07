package com.example.movieapi.controller;

import com.example.movieapi.model.Movie;
import com.example.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {

        if (movie.getName() == null || movie.getName().isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Movie name is required");
        }

        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {

        Movie movie = movieService.getMovieById(id);

        if (movie == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Movie not found");
        }

        return ResponseEntity.ok(movie);
    }
}
