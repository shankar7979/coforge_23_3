package edu.coforge.collection;

public class Customer {

	private int customerId;
	private  String customerName;
	private float customerSalary;
	
	public Customer(int customerId, String customerName, float customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSalary = customerSalary;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerSalary="
				+ customerSalary + "]";
	}	
}