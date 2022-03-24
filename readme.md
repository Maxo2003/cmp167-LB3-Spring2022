# Classes - ADT: Written description of the attributes or behaviors of an object

## Mammalia Class: Warm blooded, fur/hair, teeth, milk /
## Classifying/ grouping based on common features

	accessModifier class NameOfClass {
	
	}
	
## Attributes : instance variables

## Behaviors	: instance methods

## Instance/Object: Instance of a class physical representation of the class

# Constructor: special method that shares the same name of the class and Instantiates the object and initializes the instance variable

# Setters: Mutators : modifies the values of the instance variables
# Getters: Accessors : Reetrives the values of the instance variables 

# Examples:

	public class House {
		private int numOfWindoes;
		private String Color;
		private int numDoors;
		private int numOfRooms;
		private double cost;
		
		public House(){
			this.numWindows = 1;
			this.color      = "blue";
			this.numDoors   = 1;
			this.numRooms   = 2;
			this.cost       = 250000.00;
		}
		public House(int numWindows, String color, int numDoors, int numRooms, double cost){
			this.numWindows = numWindows;
			this.color      = color;
			this.numDoors   = numDoors;
			this.numRooms   = numRooms;
			this.cost       = cost;
		}
		
		public void setNumWindoes(int numWindows){
			this.numWindows = numWindows;
		}
		
		public void setColor(String Color){
			this.color = color;
		}
		
		public int getNumWindows() {
			return this.numWindows;
		}
		
		public String getColor() {
			return this.color;
		}
	}
	
# Object Oriented Programming Language
# Encapsulation : restricting the access to instance data by encapsulating the data and providing the access through getter & setter methods  
# Polymorphism
# Inheritance
# Abstraction
	
	



