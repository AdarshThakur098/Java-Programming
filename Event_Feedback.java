package Event;

public class Event_Feedback
{
     public int Event_no;
     public String Event_name;
     public String EOrg_name;
     public int a,b,c;
     int sum=0;
     int i = 5;

    public void Timer()
    {
        System.out.println("Feedback Calculating.......\nPresenting in:");
        while (i>0){
          
         System.out.println(i+"  Seconds");
         try {
           i--;
           Thread.sleep(1000L);     //  prog 10 -thread implemented
           
          }
          catch (InterruptedException e) {
             System.out.println(e.getMessage());
          }
        }
    }

     public Event_Feedback(int Event, String nm, String on, int m1,int m2,int m3)
     {
          Event_no = Event;
          Event_name = nm;
          EOrg_name=on;
          a = m1;
          b = m2;
          c = m3;
          sum = a+b+c;
     }
     public void display()
     {
          System.out.println("\nEvent Number : "+Event_no);
          System.out.println("Event Name    : "+Event_name);
          System.out.println("Event organiser Name    : "+EOrg_name);
          System.out.println("\n-----Feedbacks-------");
          System.out.println("management  : "+a);
          System.out.println("expieience  : "+b);
          System.out.println("Location Searching : "+c);
          System.out.println("Total Feedback     : "+sum);
           if(sum>12 && sum<=15)
          {
             System.out.println("\nResult = Excellent\n");
          }
          else if(sum>9 && sum<=12)
         {
            System.out.println("\nResult = Very Good\n");
         }
         else if(sum>6 && sum<=9)
        {
           System.out.println("\n Result = Good\n"); 
        }
        else if(sum>3 && sum<=6)
       {
         System.out.println("\nResult = Fair\n"); 
       }
       else if(sum<= 3)
       {
         System.out.println("\nResult = Poor\n"); 
       }
       else if(sum > 15)
       {
         System.out.println("Please enter feedbacks between 1 and 5 ");
       }
          
       System.out.println("------------------");
     }

}