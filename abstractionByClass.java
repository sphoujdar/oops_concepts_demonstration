package oops_concepts_demonstration;

public class abstractionByClass {
	
	
	public static void main(String[] args) {
		
		//The method tellName() is available for all child classes as it is in parent
		//methods work() and talk() are specific to the child classes according to their behaviour
		//methods pushCode() and evaluate() are only available to the objects of those classes
		//Thus we changed the object type to Developer and Trainer respectively to access them 
		
		System.out.println("\n\nHere is the behaviour of a developer. \n\n");
		
		Developer person1 = new Developer("Parth");
		person1.tellName();
		person1.work();
		person1.talk();
		person1.pushCode();
		
		
		System.out.println("\n\nHere is the behaviour of a trainer. \n\n");
		
		Trainer person2 = new Trainer("Narayan");
		person2.tellName();
		person2.work();
		person2.talk();
		person2.evaluate();
		
	}
	
	
	
	
	
	
	
	
	
}
