package com.coforge.tightcoupling;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	private int id;
	private String name;
	private HomeAddress h_address;
	private OfficeAddress o_address;

	public static void main(String[] args) {

		User user = new User();
		user.setId(676767);
		user.setName("suresh kumar");

		HomeAddress address = new HomeAddress();
		address.setAddr_id(76767);
		address.setCity_name("delhi");

		user.setH_address(address);

		OfficeAddress address1 = new OfficeAddress();
		address1.setAddr_id(76769);
		address1.setCity_name("noida");
		user.setO_address(address1);

		System.out.println("user data " + user);
		System.out.println("user home address " + user.getH_address());
		System.out.println("user office address " + user.getO_address());
	}
}

@Setter
@Getter
@ToString
class HomeAddress {
	private int addr_id;
	private String city_name;

	void addressDetail() {
		System.out.println(" office address");
		System.out.println("\t id" + getAddr_id());
		System.out.println(" \t city " + getCity_name());
	}
}

@Setter
@Getter
@ToString
class OfficeAddress {
	private int addr_id;
	private String city_name;

	void addressDetail() {
		System.out.println(" office address");
		System.out.println("\t id" + getAddr_id());
		System.out.println(" \t city " + getCity_name());
	}
}
