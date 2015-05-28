package com.saftware.pattern.filter;

import java.util.LinkedList;
import java.util.List;

public class FilterTest {

	public static void main(String args[])throws Exception{
		
		List<Person> persons = new LinkedList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John", "Male", "Married"));
	      persons.add(new Person("Laura", "Female", "Married"));
	      persons.add(new Person("Diana", "Female", "Single"));
	      persons.add(new Person("Mike", "Male", "Single"));
	      persons.add(new Person("Bobby", "Male", "Single"));
	      
	      Criteria maleCriteria = new MaleCriteria();
	      Criteria femaleCriteria = new FemaleCriteria();
	      Criteria singleCriteria = new SingleCriteria();
	      Criteria maleSingleCriteria =  new AndCriteria(maleCriteria, singleCriteria);
	      Criteria femaleSingleCriteria =  new AndCriteria(femaleCriteria, singleCriteria);
	      
	      System.out.println("Male Persons");
	      printList(maleCriteria.filter(persons));
	      
	      System.out.println("Female Persons");
	      printList(femaleCriteria.filter(persons));
	      
	      System.out.println("Male Singles");
	      printList(maleSingleCriteria.filter(persons));
	      
	      System.out.println("Female Singles");
	      printList(femaleSingleCriteria.filter(persons));
	      
	      
	}
	
	public static void printList(List<Person> persons){
		for(Person person : persons){
			System.out.println(person);
		}
	}
}
