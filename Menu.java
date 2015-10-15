
import java.util.Scanner;

public class Menu {
  /**
  *Menu code
  *wrapped normally....
  */
  @SuppressWarnings({ "resource" })
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BookYourShow bookYourShow = new BookYourShow();
    System.out.println("Choose an option\n1)Add a show\n2)Book a Show\n3)Remove a show");
    System.out.println("4)get a show\n5)print list of all books");
    int option = input.nextInt();
    String name = " ";
    while (option != 0) {
      if (option == 1) {
        bookYourShow.addAShow();
      } else if (option == 2) {
        System.out.println("Enter your name: ");
        name = input.next();
        System.out.println("Enter your Mobilenumber: ");
        long mobileNumber = input.nextLong();
        System.out.println("Enter the date and time:");
        String timeStamp = input.next();
        System.out.println("Enter number of seats and seat numbers: ");
        int noOfSeats = input.nextInt();
        if ((bookYourShow.bookAShow(name,mobileNumber, timeStamp, noOfSeats)) == true) {
          System.out.println(name + " with " + mobileNumber + " booked a show " + name + " on " + timeStamp 
              + " for " + noOfSeats + " seats.");
        } else {
          System.out.println("no seats available");
        }
      } else if (option == 3) {
        bookYourShow.removeAMovie();
      } else if (option == 4) {
        System.out.println("Enter movie name: ");
        String movieName = input.next();
        bookYourShow.getAShow(movieName);
      } else if (option  == 5) {
        System.out.println("Enter mobile number: ");
        long mobileNumber = input.nextLong();
        System.out.println("Enter the show name");
        String showName = input.next();
        System.out.println("Enter the date and time:");
        String timeStamp = input.next();
        System.out.println("Enter number of seats and seat numbers: ");
        int noOfSeats = input.nextInt();
        Show show = new Show(showName, timeStamp, noOfSeats);
        bookYourShow.printTickets(mobileNumber, show);
      }       
      System.out.println("Choose an option\n1)Add a show\n2)Book a Show\n3)Remove a show");
      System.out.println("4)get a show\n5)print list of all books");
      option = input.nextInt();  
    } 
  }

}
