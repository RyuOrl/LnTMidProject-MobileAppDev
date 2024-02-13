package lnt_mid_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            menu = scan.nextInt();
            scan.nextLine();
            cls();
            if(menu == 1) {
            	input();
            }else if(menu == 2) {
            	view();
            }
            cls();
        }while(menu != 3);
    }
    
    public static void cls() {
    	for(int i = 0; i<32; i++) {
    		System.out.println();
    	}
    }
    
    public static void input() {
    	
    	String vehicle_type;
    	String brand;
    	String name;
    	String license_number;
    	int top_speed;
    	int gas_capacity;
    	int wheel;
    	String type_of_vehicle;
    	int special_info;
    	
    	do {
    		System.out.print("Input type [Car | Motorcycle]: ");
    		vehicle_type = scan.nextLine();
    	}while(!vehicle_type.equals("Car") && !vehicle_type.equals("Motorcycle"));
    	
    	do {
    		System.out.print("Input brand [>= 5]: ");
    		brand = scan.nextLine();
    	}while(brand.length() < 5);
    	
    	do {
    		System.out.print("Input name [>= 5]: ");
    		name = scan.nextLine();
    	}while(name.length() < 5);
    	
    	do {
    		System.out.print("Input license: ");
    		license_number = scan.nextLine();
    	}while(!license_number.matches("^[A-Z]\\s\\d{1,4}\\s[A-Z]{1,3}$"));
    	
    	do {
    		System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
    		top_speed = scan.nextInt();
    		scan.nextLine();
    	}while(top_speed < 100 || top_speed > 250);
    	
    	do {
    		System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
    		gas_capacity = scan.nextInt();
    		scan.nextLine();
    	}while(gas_capacity < 30 || gas_capacity > 60);
    	
    	
    	if(vehicle_type.equals("Motorcycle")) {
    		do {
        		System.out.print("Input wheel [2 <= wheel <= 3]: ");
        		wheel = scan.nextInt();
        		scan.nextLine();
        	}while(wheel < 2 || wheel > 3);
    	}else {
    		do {
        		System.out.print("Input wheel [4 <= wheel <= 6]: ");
        		wheel = scan.nextInt();
        		scan.nextLine();
        	}while(wheel < 4 || wheel > 6);
    	}
    	
    	if(vehicle_type.equals("Motorcycle")) {
    		do {
        		System.out.print("Input type [Automatic | Manual]: ");
        		type_of_vehicle = scan.nextLine();
        	}while(!type_of_vehicle.equals("Automatic") && !type_of_vehicle.equals("Manual"));
    	}else {
    		do {
        		System.out.print("Input type [SUV | Supercar | Minivan]: ");
        		type_of_vehicle = scan.nextLine();
        	}while(!type_of_vehicle.equals("SUV") && !type_of_vehicle.equals("Supercar") && !type_of_vehicle.equals("Minivan"));
    	}
    	
    	if(vehicle_type.equals("Motorcycle")) {
    		do {
        		System.out.print("Input helm amount [>= 1]: ");
        		special_info = scan.nextInt();
        		scan.nextLine();
        	}while(special_info < 1);
    	}else {
    		do {
        		System.out.print("Input entertainment system amount [>= 1]: ");
        		special_info = scan.nextInt();
        		scan.nextLine();
        	}while(special_info < 1);
    	}
    	
    	if(vehicle_type.equals("Motorcycle")) {
    		Motorcycle motorcycle = new Motorcycle(vehicle_type, brand, name, license_number, top_speed, gas_capacity, wheel, type_of_vehicle);
    		motorcycle.setSpecialInfo(special_info);
    		vehicles.add(motorcycle);
    	}else {
    		Car car = new Car(vehicle_type, brand, name, license_number, top_speed, gas_capacity, wheel, type_of_vehicle);
    		car.setSpecialInfo(special_info);
    		vehicles.add(car);
    	}
    	
    	System.out.println("ENTER to return");
    	scan.nextLine();
    }
    
    public static void view() {
    	int number;
    	do {
    	System.out.println("|-----|---------------|---------------|");
    	System.out.println("|No   |Type           |Name           |");
    	System.out.println("|-----|---------------|---------------|");
    	for(int i = 0; i<vehicles.size(); i++) {
    		System.out.printf("|%-5d|%-15s|%-15s|\n", i+1, vehicles.get(i).getVehicle_type(), vehicles.get(i).getName());
    		System.out.println("|-----|---------------|---------------|");
    	}
    	System.out.println("|-----|---------------|---------------|");
    	System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]: ");
    	number = scan.nextInt();
    	scan.nextLine();
    	cls();
    	if(number != 0 && number > 0 && number <= vehicles.size()) {
    		Vehicle vehicle = vehicles.get(number-1);
    		vehicle.printDetails();
    		vehicle.printSpecialInfo();
    		vehicle.printAction();
    		if(vehicle.getVehicle_type().equals("Motorcycle")) {
    			System.out.print("Input helm price: ");
    			int price = scan.nextInt();
    			scan.nextLine();
    			System.out.println("Price: " + price);
    		}
    		System.out.println("ENTER to return");
    		scan.nextLine();
    		cls();
    	}
    	
    	}while(number != 0);
    }

    
}
