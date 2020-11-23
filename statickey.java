import java.util.*;

class statickey{
	
	static int Eno,e;
	
	static{
		Eno= 10;
		System.out.println("The total event: "+ Eno + "\n");
	}

	static void Happeingevent(){
		System.out.println("Events Happening: ");
		Scanner input= new Scanner(System.in);
		e= input.nextInt();
		Eno= Eno-e;
		System.out.println("canceled Event: "+ Eno+ "\n");
	}

	static void CanceledEventdetail(){
		System.out.println("How many Cnaceled Event Rescheduled: ");
		Scanner input= new Scanner(System.in);
		e=input.nextInt();
		Eno= Eno-e;
		System.out.println("\nRemaining Events: "+ Eno);
	}

	public static void main(String args[]){
		
		Happeingevent();
		CanceledEventdetail();

		System.out.println("\nSucessfully entered the Details and checked the Events.");

	}
}