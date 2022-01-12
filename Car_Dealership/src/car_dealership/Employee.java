package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer cust,boolean finance,Vehicle vehicle) {
		
		if(finance == true) {
			double loanAmount=vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
		else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			//customer pays in cash
			processTransaction(cust,vehicle);
		}
		else
		{
			System.out.println("Customer will need more mony to purchege vehicle: "+vehicle);
		}
	}

	public void runCreditHistory(Customer cust,double loanAmount) {
		System.out.println("Run Credit history for customer...");
		System.out.println("Customer has been approve to purchage the vehicle.");
	}
	public void processTransaction(Customer cust,Vehicle vehicle ) {
		System.out.println("Customer has purcheged the vehicle "
	+vehicle+" for the price "+vehicle.getPrice());
	}
}
