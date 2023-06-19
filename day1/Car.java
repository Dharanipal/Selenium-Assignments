package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println(" drive the car");
	}
	public void applyBrake() {
		System.out.println("apply the brake");
	}
//      void soundHorn() {
    public void isPuncture() {
    	System.out.println("car is puncture");
    }
    public static void main(String[] args) {
    	Car cr=new Car();
    	cr.driveCar();
    	cr.applyBrake();
    	cr.isPuncture();}
    }