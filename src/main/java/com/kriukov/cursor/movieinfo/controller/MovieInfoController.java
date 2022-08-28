package com.kriukov.cursor.movieinfo.controller;

import com.kriukov.cursor.movieinfo.entity.MovieInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieInfo> getMovieInfo(@PathVariable String movieId){
        return ResponseEntity.ok(new MovieInfo(movieId, "Test name"));
    }
}
