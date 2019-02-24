package package2;

import package1.Flight;

public class Class2 {



    public  void getPassenger(){
        Flight flight=new Flight();

        //passenger is public variable so it is direct accessible from other class
        int i=flight.passenger;

        //seat is not public variable so it cannot be
        // direct accessible from other class
        int j=flight.seat;
    }
}
