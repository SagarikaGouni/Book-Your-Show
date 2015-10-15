# Book-Your-Show



This assignment is designed to reinforce your understanding of arrays, Regex, loops, and Java, in general. It asks you to build a BookYourShow class capable of booking tickets for movies. The BookYourShow class has a few simple behaviors, which are described below. It also asks you to develop a Menu class which should contain the main() method and provide the user with a menu allowing the user to exercise all of the features of the BookYourShow class.
The Show Class
Each Show should have the following information about the event it describes.
The constructor should take a three parameters, the name of the movie, the date, the show time, and the seats with seat numbers.
The Patron Class
Each patron should have the following information.
Name and Mobile Number
The BookYourShow Class
Each BookYourShow should allow the user to store Shows. The user can add, remove, and access shows as described below.
Users should be able to addAShow() 
Users should be able to getAShow() by specifying the movie name (a String). This method should return all the shows that matches the given movie name.
Users should be able to bookAShow() by specifying the Name, Mobile Number, Date, Time and the Number of Seats. If the seats are not available then the booking should not be possible.
Users should be able to printTickets() by specifying their mobile number and the show
Users should be able to removeAMovie() which should remove all the shows that match this movie. 

The Menu Class
The menu should provide the user with the option of creating a new BookYourShow, and then of adding, booking, removing individual shows, or of printing a list of all books within the BookYourShow.

