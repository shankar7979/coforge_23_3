package edu.coforge.collection.main;

import com.coforge.model.Employee;

import edu.coforge.collection.util.EmployeeOperation;

public class EmployeeMain {

	public static void main(String[] args) {
				
		Employee employee[]=new Employee[5];
		EmployeeOperation operation=new EmployeeOperation();
		
		int id[]= {10001,20001,30001,10002,10003};
		String nm[]= {"suman kumar","aman kumar","ram kumar","anil kumar",	"sunil kumar"};
		float sal[]= {20000,34000,90000,12000,45000};
		
		System.out.println("==== add operation=== ");
		
		for (int i = 0; i < sal.length; i++) {
			employee[i]=new Employee(id[i], nm[i],sal[i] );
			operation.addEmployee(employee[i]);
		}
		
		System.out.println("==== all employee operation=== ");
		for (Employee  e : operation.getAllEmployee()) {
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		
	}
}
