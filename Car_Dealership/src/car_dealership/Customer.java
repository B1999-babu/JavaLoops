package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double CashOnHand;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
			address+="Dealership City";
		this.address = address;
	}



	public double getCashOnHand() {
		return CashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		CashOnHand+=500;
		CashOnHand = cashOnHand;
	}



	public void PurchageCar(Vehicle vehical,Employee emp,boolean finance) {
		emp.handleCustomer(this, finance, vehical);
		
	}
}
