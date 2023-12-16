package edu.coforge.java8.stream;

import java.util.ArrayList;
import java.util.List;

import edu.coforge.collection.model.Employee;
import edu.coforge.collection.util.EmployeeOperation;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee[]=new Employee[5];
		
		int id[]= {10001,20001,30001,10002,10003};
		String nm[]= {"suman kumar","aman kumar","ram kumar","anil kumar",	"sunil kumar"};
		float sal[]= {20000,34000,90000,12000,45000};
		
		List<Employee> empList=new ArrayList<>();
		
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(nm[i]);
			employee[i].setEmpSalary(sal[i]);
			empList.add(employee[i]);
		}

		empList.stream().forEach(a->System.out.println(a));
		System.out.println();
		empList.stream().forEach(a->System.out.println(a.getEmpId()+"\t"+a.getEmpName()+"\t"+a.getEmpSalary()));
		
		
	}
}
