/**
* Lab9 Car class
* @author Cameron Gates
*
*/

public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	public Car(String theMake, String theModel, String thePlate, int numDoors, 
		int numPassengers) {
		super(theMake, theModel, thePlate);
		this.doors = numDoors;
		this.passengers = numPassengers;
	}
		
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		String temp = this.doors + "-door " + this.getMake() + this.getModel() + 
		" with license " + this.getPlate();
		return temp;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		Car otherCar = (Car) other;
		if(super.equals(otherCar) && this.doors == otherCar.doors && 
			this.passengers == otherCar.passengers) 
			return true;
		else
			return false;
	}
	
	public Car copy() {
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int theDoors = this.doors;
		int thePassengers = this.passengers;
		Car newCar = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return newCar;
	}
}