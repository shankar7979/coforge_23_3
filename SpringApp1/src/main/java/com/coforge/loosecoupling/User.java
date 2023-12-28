package com.coforge.loosecoupling;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

interface Address {

	void addressDetail();

}

@Setter
@Getter
@ToString
public class User {

	private int id;
	private String name;
	private Address address;

	public static void main(String[] args) {
		 
		User user=new User();
		user.setId(676776);
		user.setName("sudhir kumar");
		user.setAddress(new HomeAddress());
		//user.setAddress(new OfficeAddress());
		
		System.out.println(user);
	}
}

@Setter
@Getter
@ToString
class HomeAddress implements Address {

	@Override
	public void addressDetail() {
		System.out.println(" office address");
	}
}

@Setter
@Getter
@ToString
class OfficeAddress implements Address {
	
	@Override
	public void addressDetail() {
		System.out.println(" office address");
	}
}
