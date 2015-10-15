
import java.text.SimpleDateFormat;
import java.util.Date;

public class Show {
  String nameOfMovie;
  String timeStamp = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss").format(new Date());
  int seatsWithSeatsNumbers;
  
  public String toString() {
    return (this.nameOfMovie + " , " + this.timeStamp + " , " +  this.seatsWithSeatsNumbers);
  }
  
  Show(String movieName, String time, int noOfSeats) {
    nameOfMovie = movieName;
    timeStamp = time;
    seatsWithSeatsNumbers = noOfSeats;
  }
  
  
}

