abstract class Event                                             //abstract class
{ 
    protected String EName;
    boolean isExists;

    // Event class parameterized constructor
    public Event(String EName) {
        this.EName = EName;                                //using this keyword to give reference 
        this.isExists=false;
    }

    public final String getEName() {                                      //using final keyword
        return EName;
    }

    abstract boolean getSponsership();

}

// derived class one
class office extends Event

{

    public office(String EName) {
        // calling Event class constructor
        super(EName);
    }


    public boolean getSponsership() {
        if (getEName() == "Ambani") {
            isExists=true;
        }
        return isExists;
    }
	
} 

//derived class two 
class Sports extends Event
{ 

    public Sports(String EName) {
        
        super(EName);
    }

   
    public boolean getSponsership() {
        if (getEName() == "Anuj raj" || getEName()=="Dhoni") {
            isExists=true;
        }
        return isExists; 
    }
	
} 

// Driver class 
public class Eventmanagement
{ 
	public static void main(String[] args) 
    {  
        String name="Check the Event and the Numberof Event under him/her.";                                            //String class
        System.out.println("..................................................................");
        System.out.println(name);
        System.out.println(".................................................................."+"\n");
		// creating office object 
		Event s1 = new office("Ambani"); 
		
		// creating delivery object 
		Event s2 = new Sports("Dhoni"); 
        
        StringBuffer s = new StringBuffer("Official");                                //StringBuffer class
        s.append(" work is managed by ");
        s.append(s1.getEName());
        s.append(":- ");
        s.append(s1.getSponsership());
		System.out.println(s);
		System.out.println("20 Official Staffs under him ." + "\n");
        
        
        StringBuffer st = new StringBuffer("Sports"); 
        st.append(" Event is Arranged by ");
        st.append(s2.getEName());
        st.append(":- ");
        st.append(s2.getSponsership());
		System.out.println(st);
		System.out.println("20 volunteer under him and 5 events.");
		 
		
	} 
} 