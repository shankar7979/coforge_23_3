package edu.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

class SortById implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
	}
}
class SortById1 implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return Integer.valueOf(o2.getId()).compareTo(Integer.valueOf(o1.getId()));
	}
}

public class PersonMain {
static void display(Person[] p) {
	System.out.println("\n Person data ");
	for (Person person : p) {
		System.out.println(person);
	}
}	
	public static void main(String[] args) {
		int id[]= {10002,10001,10003,10007,1006};
		String nm[]= {"suman kumar","aman kumar","ram kumar","anil kumar",	"sunil kumar"};
		float sal[]= {20000,34000,90000,12000,45000};
		
		Person person[]=new Person[5];
		for (int i = 0; i < person.length; i++) {
			person[i]=new Person(id[i], nm[i], sal[i]);
		}
		display(person);
		
		System.out.println("sorted by id in ascending order");
		Arrays.sort(person,new SortById());
		display(person);
		
		System.out.println("sorted by id in descending order");
		Arrays.sort(person,new SortById1());
		display(person);
		
	}
}
