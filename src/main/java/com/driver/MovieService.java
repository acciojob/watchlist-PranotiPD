package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    void addMovie(Movie movie){
        String name = movie.getName();
        movieRepository.addMovieInDatabase(name, movie);
    }
    void addDirector(Director director){
        String name = director.getName();
        movieRepository.addDirectorInDatabase(name, director);
    }
    void addMovieDirector(String mov_name, String dir_name){
        movieRepository.mapMovieDirector(mov_name, dir_name);
    }
    public Movie getMovieByName(String name){
        return movieRepository.getMovieByNameDB(name);
    }
    public Director getDirectorByName(String name){
        return movieRepository.getDirectorByNameDB(name);
    }
    public List<String> getMovieListByDirName(String name){
        return movieRepository.getMoviesByDirectorName(name);
    }
    public List<Movie> getListOfAllMovies(){
        return movieRepository.getListOfMoviesFromDB();
    }
    public void deleteDirByName(String name){
        movieRepository.deleteDirByNameDB(name);
    }
}
