package BookMyShowLLD;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import BookMyShowLLD.enums.City;
import BookMyShowLLD.enums.SeatCategory;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();
        bookMyShow.createBooking(City.PUNE, "BAAHUBALI");

        bookMyShow.createBooking(City.PUNE, "BAAHUBALI");

    }

     private void createBooking(City userCity, String movieName) {

        List<Movie> movies = movieController.getMoviesByCity(userCity);

        Movie interestedMovie = null;
        for (Movie movie : movies) {

            if ((movie.getMovieName()).equals(movieName)) {
                interestedMovie = movie;
            }
        }

        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShow(interestedMovie, userCity);

        Map.Entry<Theatre,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatId();
        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setSeat(myBookedSeats);
            booking.setShow(interestedShow);
        } else {
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }


     private void initialize() {

        createMovies();

        createTheatre();
    }


    public void createMovies() {

        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDurationInMinutes(128);

        Movie baahubali = new Movie();
        baahubali.setMovieId(2);
        baahubali.setMovieName("BAAHUBALI");
        baahubali.setMovieDurationInMinutes(180);

        movieController.addMovie(City.PUNE, baahubali);
        movieController.addMovie(City.MUMBAI, avengers);
        movieController.addMovie(City.PUNE, avengers);
        movieController.addMovie(City.MUMBAI, baahubali);

    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime);
        return show;
    }

    private void createTheatre() {

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setCity(City.PUNE);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreens().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreens().get(0), baahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreens(createScreen());
        pvrTheatre.setCity(City.PUNE);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreens().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreens().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theatreController.addTheatre(City.PUNE, inoxTheatre);
        theatreController.addTheatre(City.MUMBAI, pvrTheatre);

    }

    private List<Screen> createScreen() {

        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);

        return screens;
    }

    private List<Seat> createSeats() {

        List<Seat> seats = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

}
