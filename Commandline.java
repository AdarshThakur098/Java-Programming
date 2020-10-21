import java.util.Scanner;

public class Commandline {

 String eventName;
String organisedBy;
String organiserEmail;

 Commandline(String eventName,String organisedBy,String organiserEmail)
{
 this.eventName = eventName;
 this.organisedBy=organisedBy;
 this.organiserEmail=organiserEmail;
}

public Commandline() {
eventName=organisedBy=organiserEmail="";
}


public static void main(String args[])
{
int count = args.length;
if (count>=1) {
Commandline cm = new Commandline();
cm.eventName = args[0];
cm.organisedBy = args[1];
cm.organiserEmail = args[2];
System.out.println("\n\t MODIFIED Event INFORMATION");
System.out.println("\nEvent Name: :"+cm.eventName);
System.out.println("\n Orgainser Name:"+cm.organisedBy);
System.out.println("\nOrganiser Email:"+cm.organiserEmail);
}
else {

    System.out.print("Enter Event Name: ");
Scanner scanner = new Scanner(System. in);
    String eventName = scanner. nextLine();
    System.out.print("Enter Orgainser Name: ");
    String organisedBy = scanner. nextLine();
    System.out.print("Enter Organiser Email: ");
    String organiserEmail = scanner. nextLine();
   
    Commandline cm = new Commandline(eventName,organisedBy,organiserEmail);
System.out.println("\n\t MODIFIED Event INFORMATION");
System.out.println("\nEvent Name: :"+cm.eventName);
System.out.println("\n Orgainser Name:"+cm.organisedBy);
System.out.println("\nOrganiser Email:"+cm.organiserEmail);
scanner.close();
}
}



}