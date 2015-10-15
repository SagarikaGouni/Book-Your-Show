
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BookYourShow {
  Scanner in = new Scanner(System.in);
  List<Show> shows = new ArrayList<Show>();
  String[] bookedShows;

  /**
  *Add a show method
  *wrapped normally....
  */
  public void addAShow() {
    
    System.out.println("nameOfMovie is: ");
    String movieName = in.next();
    System.out.println("Date and time of the show is: ");
    String time = in.next();
    System.out.println("Seats and Seats numbers are: ");
    int seats = in.nextInt();
    Show show = new Show(movieName, time, seats);
    shows.add(show);
  }

  /**
  *get a show method
  *wrapped normally....
  */
  public void getAShow(String movieName) {
    for (Show s: shows) {
      if (s.nameOfMovie.equals(movieName)) {
        System.out.println("Name of Movie: " + s.nameOfMovie + " " +  "\nShow Date and time :" 
            + s.timeStamp + " " + "\nAvailable seats: " + s.seatsWithSeatsNumbers);
      }
    }
  }

  /**
  *book a show method
  *wrapped normally....
  */
  public boolean bookAShow(String name, long mobileNumber, String timeStamp, int noOfSeats) {
    System.out.println("Enter movie name: ");
    String movie = in.next();
    Patron patron = new Patron(name, mobileNumber);
    Show show = new Show(movie, timeStamp, noOfSeats);
    for (int index = 0; index < bookedShows.length;index++) {
      for (Show s: shows) {
        if ((s.nameOfMovie.equals(movie)) && (s.seatsWithSeatsNumbers > noOfSeats) ) {
          bookedShows[index] = s.nameOfMovie;
          break;
        }
        return true;
      }
    }
    return false;
  }

  /**
  *print tickets method
  *wrapped normally....
  */
  public void printTickets(long mobileNumber, Show show) {
   
    for (int index = 0; index < bookedShows.length; index++) {
      if (bookedShows[index].equals(show) ) {
        System.out.println("\nmobile number: " + mobileNumber + "\nShow: " + show );
        System.out.println(show);
      }
    }
    System.out.println("no bookings available with this person");
  }

  /**
  *remove a movie method
  *wrapped normally....
  */
  public void removeAMovie() {
    System.out.println("Enter movie name: ");
    String name = in.next();
    for (Show s: shows) {
      if (s.nameOfMovie.equals(name)) {
        shows.remove(s);
        System.out.println(shows);
        break;
      }
    }
  }
}
