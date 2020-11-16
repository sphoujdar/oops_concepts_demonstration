package oops_concepts_demonstration;
  
interface interfaceTrainer { 
      
	// all are the abstract methods.
    public void train();
    void evaluate();
    
    //data members accessible outside classes only by interface object , not class object
    String subject = "OOPS Concepts";
     
}

interface interfaceDeveloper { 
    
	// all are the abstract methods. 
    void pushCode();
    void attendMeeting();
    
    //data members accessible outside classes only by interface object , not class object
    String expertise = "Java";
}


  
class trainerJob implements interfaceTrainer {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void train() {
		System.out.println(name + " is a FullTime " + subject + " Trainer");
	}
	
	public void evaluate() {
		System.out.println(name + " always evaluates assignments");
	}
      
     
} 
  
class developerJob implements interfaceDeveloper { 
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void pushCode() {
		System.out.println(name + " is a FullTime " + expertise + " Developer");
	}
	
	public void attendMeeting() {
		System.out.println(name + " always attends Meetings");
	}
    
} 


class twoJobs implements interfaceTrainer, interfaceDeveloper { 
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void train() {
		System.out.println(name + " is a PatTime " + subject + " Trainer");
	}
	
	public void evaluate() {
		System.out.println(name + " sometimes evaluates assignments");
	}
	
	public void pushCode() {
		System.out.println(name + " is a PartTime " + expertise + " Developer");
	}
	
	public void attendMeeting() {
		System.out.println(name + " sometimes attends Meetings");
	}
    
}

   

public class abstractionByInterface {
	  public static void main (String[] args) { 
	      
		  //has only one interface's methods
		  trainerJob trainer = new trainerJob();
		  trainer.setName("Parth");
		  trainer.train();
		  trainer.evaluate();
		  
		  //has only one interface's methods 
		  developerJob developer = new developerJob();
		  developer.setName("Vedant");
		  developer.pushCode();
		  developer.attendMeeting();
		  
		  //has both interface's methods
		  twoJobs wizard = new twoJobs();
		  wizard.setName("Yash");
		  wizard.pushCode();
		  wizard.attendMeeting();
		  wizard.train();
		  wizard.evaluate();
	      
	    } 
	
	
}
