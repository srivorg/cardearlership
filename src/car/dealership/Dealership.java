package car.dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
		cust1.setCustName("Test");
		cust1.setCustAddress("abc");
		cust1.setCashOnHand(1500);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Tesla");
		vehicle.setPrice(14999);
		
		Employee emp = new Employee();
		emp.setEmpName("Bob");
		
		cust1.purchaseCar(vehicle, emp, true);
	}

}
