package edu.coforge.collection;

public class User {

	private int id;
	private  String name;
	
	@Override
	public String toString() {
		return "\nUser Information\n"+
				"\tId is "+getId()+
				"\n\tName is "+getName()
				;
	}
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
}
