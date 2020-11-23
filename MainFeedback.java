import Event.Event_Feedback;
import java.util.*;
import java.lang.*;
import java.io.*;
class MainFeedback
{
     public static void main(String[] args)
     {
          String nm,on;
          int Event;
          Scanner sc = new Scanner(System.in);
          
          System.out.println("\nDIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
          System.out.println("Enter INFORMATION here");
          System.out.print("Enter Event no:= ");
          Event = sc.nextInt();
          System.out.print("Enter Event Name:= ");
          nm = sc.next();
          System.out.print("Enter Event organiser Name:= ");
          on = sc.next();
          int m1,m2,m3;
          System.out.println("Give feedbacks For 1)Management 2)expirience  3)Location Searching\n");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          Event_Feedback s = new Event_Feedback(Event, nm, on, m1, m2, m3);
     
          s.Timer();
          s.display();
     }
}