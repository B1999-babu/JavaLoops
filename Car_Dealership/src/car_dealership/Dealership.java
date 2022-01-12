package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust=new Customer();
		cust.setName("baburao");
		cust.setAddress("belagavi");
		cust.setCashOnHand(12000);
		
		
		
		Vehicle vehicle=new Vehicle("Honda","City",15000);
		
		
		Employee emp=new Employee();
		
		cust.PurchageCar(vehicle, emp, false);
		
		Vehicle car=new Vehicle("Honda","City",15000);
		boolean value=car.equals(vehicle);
			System.out.println(value);
		

	}	

}
