package lnt_mid_project;

public class Motorcycle extends Vehicle{
	private int helm;
	public Motorcycle(String vehicle_type, String brand, String name, String license_number, int top_speed, int gas_capacity, int wheel, String type_of_vehicle) {
		super(vehicle_type, brand, name, license_number, top_speed, gas_capacity, wheel, type_of_vehicle);
	}
	
	@Override
	public void setSpecialInfo(int special_info) {
		helm = special_info;
	}
	
	@Override
    public int getSpecialInfo() {
    	return helm;
    }
}
