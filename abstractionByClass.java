package oops_concepts_demonstration;

public class abstractionByClass {
	
	
	public static void main(String[] args) {
		
		System.out.println("\n\nHere is the behaviour of a developer. \n\n");
		
		Person person1 = new Developer("Parth");
		person1.tellName();
		person1.work();
		person1.talk();
		
		System.out.println("\n\nHere is the behaviour of a trainer. \n\n");
		
		Person person2 = new Trainer("Narayan");
		person2.tellName();
		person2.work();
		person2.talk();
		
		
	}
	
	
	
	
	
	
	
	
	
}
