
public class House {
	private int numWindows;
	private String color;
	private int numDoors;
	private int numRooms;
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
		
		//Setters
		public void setNumWindows(int numWindows){
			this.numWindows = numWindows;
		}
		
		public void setColor(String Color){
			this.color = color;
		}
		
		//Getters
		public int getNumWindows() {
			return this.numWindows;
		}
		
		public String getColor() {
			return this.color;
		}
		
		public static void main(String[] args) {
			House myHouse = new House();
			System.out.println(myHouse.color);
		}
	}