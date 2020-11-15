package oops_concepts_demonstration;

abstract class Person{
	String name;
	
	Person(String passedName) {
		this.name = passedName;
	}
	
	void tellName () {
		System.out.println("The name of this Person is " + this.name);
	}
	
	//Remember : Abstract Methods strictly do not specify a body in the parent class
	abstract void talk();
	abstract void work();
}

class Trainer extends Person {
	
	
	// Need to use super function in abstract class constructor to set parent class constructor
	public Trainer(String trainerName) {
		super(trainerName);
	}
	
	//Now Child Classes MUST implement abstract methods from Parent class
	
	void talk() {
		System.out.println(this.name + " gives lectures as a Trainer.");
	}
	
	void work() {
		System.out.println(this.name + " evluates assignments as a Trainer.");
	}
}


class Developer extends Person {
	
	
	// Need to use super function in abstract class constructor to set parent class constructor
	public Developer(String developerName) {
		super(developerName);
	}
	
	//Now Child Classes MUST implement abstract methods from Parent class
	
	void talk() {
		System.out.println(this.name + " attends meetings as a Developer.");
	} 
	
	void work() {
		System.out.println(this.name + " pushes code as a Developer.");
	}
}
