package BookMyShowLLD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import BookMyShowLLD.enums.City;

public class MovieController {
    Map<City,List<Movie>> cityVsMovies;
    List<Movie> allMovies;
    public MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    void addMovie(City city, Movie movie){
        allMovies.add(movie);
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }
    public Movie getMovieByName(String movieName){
        for(Movie movie : allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }
    List<Movie> getMoviesByCity(City city){
        return cityVsMovies.get(city);
    }
}
