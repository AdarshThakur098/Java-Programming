import java.util.Scanner;


public class Events {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      Scanner stdin = new Scanner(System.in);
     
	int num;
        String arrayNames[] = new String[20];
        int arrayId[] = new int[20];

        System.out.println("Enter the Number of events You want to add :  ");
	num = input.nextInt();
	
	
	
       System.out.println("Do You want to add more (y/n):");

       if (stdin.next().startsWith("y")){
      	for (int i = 0 ; i < num ; i++ ) {
           System.out.println("Enter the Id: ");
	   arrayId[i] = input.nextInt(); 
           System.out.println("Enter the Event Name: ");
	   arrayNames[i] = stdin.next();
          } 
      }
        
        
	PrintEventDetails(arrayNames,arrayId);
      
        input.close();
        stdin.close();
   }
   public static void PrintEventDetails(String arrNames[],int arrIds[]){

        int n = arrNames.length;
	System.out.println("\n\nEvent add details:  ");
        for (int i = 0; i < n; i++) {
		if (arrNames[i] != null){
            System.out.println("Event Id: "+arrIds[i]+" Event Name: "+arrNames[i]);
    	}  
       }
    }
}



