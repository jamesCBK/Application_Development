/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketreservationsystem;
import java.util.*;
/**
 *
 * @author Jayachandran
 */
/*
 The class register contains all the oprations which is called by the main class from instance object creation.
 Collection Framework used are Hash map and array list.

 * Hash Map : In computing, a hash table (hash map) is a data structure which implements an associative array abstract data type, a structure that can map keys to values.
 A hash table uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.
 * Arraylist : The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed. Standard Java arrays are of a fixed length.
 After arrays are created, they cannot grow or shrink, which means that you must know in advance how many elements an array will hold.
 */
class SuperStorage{
     static int RandomBooking=101;
     static List bhaagubhali=new ArrayList<Integer>(Arrays.asList(9,9,9,9,9,9));
     static Map<Integer, ArrayList<Integer>> BookingHistory = new HashMap<Integer, ArrayList<Integer>>();
}
class Register extends SuperStorage
{
   
 
    String Fullname;
    int Age;
    double ContactNumber;
    int movieselect,Numberoftickets,totalcost;
    int seatindex,seatindexbook,Continueselect,viewticket;
    int TicketId;
    Scanner input = new Scanner(System.in);
   public Register(String name, int age, double contactnumber)
   {
     Fullname = name;
     Age = age;
     ContactNumber = contactnumber;
     }
   public void book(){
            System.out.println("Movies running are");
            System.out.println("Enter 1. Bhaagubhali 2.kuruvi");
            movieselect = input.nextInt();
            System.out.println("Enter number of tickets");
            Numberoftickets = input.nextInt();
            totalcost = Numberoftickets*2;
            System.out.println("total cost: " +totalcost);
            System.out.println("if you wish to continue press 1 else 0 ");
            Continueselect  = input.nextInt();
            if(Continueselect==1)
            {
            System.out.println(""+bhaagubhali);
            System.out.println("9->available 0->booked  press " );
            System.out.println("Type from where seats to be booked 1 to 6 " );
            seatindex  = input.nextInt();
            seatindexbook = seatindex;
            for(int i=Numberoftickets;i>0;i--)
            {
                bhaagubhali.set(seatindex,0);
                seatindex++;
            }
            System.out.println(""+bhaagubhali);
            System.out.println("Sucessfully booked");
            System.out.println("Your Booking id is"+RandomBooking);
            BookingHistory.put(RandomBooking,new ArrayList<Integer>(Arrays.asList(Numberoftickets, seatindexbook, RandomBooking)));
            RandomBooking++;

//iterator
        for (Map.Entry<Integer, ArrayList<Integer>> entry : BookingHistory.entrySet()) {
                     System.out.print(entry.getKey()+" | ");
        for(int key2 : entry.getValue())
        {
            System.out.print(key2+" ");
        }
        System.out.println();
    }
            }else{
                book();
            }
   }
   public Register(int viewtickets)
   {
       TicketId = viewtickets;
   }
   void getticketdetails(){

       System.out.println("" +TicketId);
       if(BookingHistory.containsKey(TicketId))
       {
      
          // System.out.println(BookingHistory.containsKey(TicketId));
       }

       else
       {
            System.out.println("Wrong Booking Id");
       }}
}
public class TicketReservationSystem {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

        int viewtickets;
        System.out.println("-----------Welcome to ticket booking centre-------------");
        System.out.println(" Enter 1 to login and 2 to Exit");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        while(start==1){
            System.out.println("Enter anyone of the option 1.Register 2.View booking details");
            int option = input.nextInt();
        switch(option){
            case 1:
        System.out.println("Enter your name, Age, contact number");
        String Name = input.next();
        int Age = input.nextInt();
        double ContactNumber = input.nextDouble();
       if(Age>18)
        {
            System.out.println("------Welcome------\n--Now you are permitted to book tickets--\n");
            Register regobject = new Register(Name, Age, ContactNumber);
            regobject.book();
       }
        else
        {
            System.out.println("Sorry you cannot be registered");
        }
            case 2:
                  System.out.println("enter booking id to view\n [Number , from seat no , Bookingid]");
                  viewtickets = input.nextInt();
                  Register viewobject = new Register(viewtickets);
                  viewobject.getticketdetails();
    }}
    }
}