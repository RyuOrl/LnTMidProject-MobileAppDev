package lnt_mid_project;

public abstract class Vehicle {

	private String vehicle_type;
	private String brand;
	private String name;
	private String license_number;
	private int top_speed;
	private int gas_capacity;
	private int wheel;
	private String type_of_vehicle;
	
	public Vehicle(String vehicle_type, String brand, String name, String license_number, int top_speed, int gas_capacity, int wheel, String type_of_vehicle) {
		this.vehicle_type = vehicle_type;
		this.brand = brand;
		this.name = name;
		this.license_number = license_number;
		this.top_speed = top_speed;
		this.gas_capacity = gas_capacity;
		this.wheel = wheel;
		this.type_of_vehicle = type_of_vehicle;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLiscense_number() {
		return license_number;
	}

	public void setLiscense_number(String license_number) {
		this.license_number = license_number;
	}

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}

	public int getGas_capacity() {
		return gas_capacity;
	}

	public void setGas_capacity(int gas_capacity) {
		this.gas_capacity = gas_capacity;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getType_of_vehicle() {
		return type_of_vehicle;
	}

	public void setType_of_vehicle(String type_of_vehicle) {
		this.type_of_vehicle = type_of_vehicle;
	}
	
	public abstract void setSpecialInfo(int special_info);
	
    public abstract int getSpecialInfo();
	
	
	
	
}
