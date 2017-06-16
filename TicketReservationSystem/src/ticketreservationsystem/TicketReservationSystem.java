/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketreservationsystem;
import java.util.*;
/**
 *
 * @author HP
 */
class Register
{
    List bhaagubhali=new ArrayList<Integer>(Arrays.asList(9,9,9,9,9,9));
    Map<Integer, List<Object>> BookingHistory = new HashMap<Integer, List<Object>>();
    String Fullname;
    int Age;
    double ContactNumber;
    int movieselect,Numberoftickets,totalcost;
    int RandomBooking=101,seatindex,seatindexbook,Continueselect,viewticket;
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
            BookingHistory.put(RandomBooking,new ArrayList<Object>(Arrays.asList(Numberoftickets, seatindexbook, RandomBooking)));          
            }else{
                book();
            }
   }
   public Register(int viewtickets)
   {
       TicketId = viewtickets;
   }
   void getticketdetails(){
       if(BookingHistory.containsKey(TicketId))
       {
        System.out.println("The Details are\n"+BookingHistory.get(viewticket));
   }
       else
       {
            System.out.println("Wrong Booking Id");
       }}
}


// }
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
