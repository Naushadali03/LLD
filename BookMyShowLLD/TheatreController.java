package BookMyShowLLD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import BookMyShowLLD.enums.City;

public class TheatreController {
    Map<City,List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;
    public TheatreController(){
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }
    public void addTheatre(City city,Theatre theatre){
        allTheatre.add(theatre);
        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }
    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = cityVsTheatre.get(city);


        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }

}
