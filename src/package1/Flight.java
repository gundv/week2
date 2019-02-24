package package1;

public class Flight {

    //Object element the element that should usable only inside the class

    //final parameter is the parameter is the parameter that can assign value not more than one time
    //it can receive the value by direct assign or via the constructor
    //this parameter may only access inside the class as it is the private variable
    private final int seat;

    private int remain;

    //this parameter may only access inside the class as it is the private variable
    public int passenger=0;


    /*
   static parameter, the parameter that share across all other classes
     */
    public static final String SHARED="1111";


    //default constructor should come with default value if the object have one otherwise just zero or null
    public Flight(){
        seat=125;
        passenger=0;
    }



    //constructor with parameters the parameter may be vary based the needed in constructor
    public Flight(int seat, int passenger) {
        this.seat = seat;
        this.passenger = passenger;
   }

   //the idea of using object element as it is private, we can easily manage the parameter and validate
   // if it fit with our objective or not
   //the method here is not the static method therefore we cannot access it from other class without
   //initialize the object
   public int getPassenger() throws Exception{
        if(passenger>seat) throw new Exception("Passenger cannot be bigger than seat");
        return passenger;
   }

   //Here is the example of the static method
   //just like static variable it can be access from other class without any initialization of the object
   public static void printSomething(boolean showC){
       System.out.println("print a");
       System.out.println("print b");
       if(!showC)
        return;
       System.out.println("print c");
   }

    public int getSeat() {
        return seat;
    }


    public boolean hasRoom() {
        int remain = seat - passenger;
//        if(remain <= seat) return true;
//        else return false;
        return remain <= seat;
    }
}
