package car.dealership;

public class Employee {
	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (finance) {
			runCreditHistory(cust, vehicle.getPrice() - cust.getCashOnHand());
		} else if (cust.getCashOnHand() >= vehicle.getPrice()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Sorry, need more cash to get the vehicle");
		}
	}

	public void runCreditHistory(Customer cust, double loanAmt) {
		if (loanAmt < 0) {
			System.out.println("Congratulations!! Vehicle purchased");
		}else {
			System.out.println("Sorry, need more cash to get the vehicle");
		}

	}

	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Congratulations!! Vehicle purchased");
	}

}
