package lnt_mid_project;

public class Car extends Vehicle{
	private int entertainment_system;
	public Car(String vehicle_type, String brand, String name, String license_number, int top_speed, int gas_capacity, int wheel, String type_of_vehicle) {
		super(vehicle_type, brand, name, license_number, top_speed, gas_capacity, wheel, type_of_vehicle);
	}
	
	@Override
	public void setSpecialInfo(int special_info) {
		entertainment_system = special_info;
	}
	
	@Override
    public int getSpecialInfo() {
    	return entertainment_system;
    }
	
	@Override
	public void printSpecialInfo() {
		System.out.println("Entertainment System: " + entertainment_system);
	}
}