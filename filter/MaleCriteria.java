package com.saftware.pattern.filter;

import java.util.LinkedList;
import java.util.List;

public class MaleCriteria implements Criteria{

	public List<Person> filter(List<Person> persons) {
		List<Person> males = new LinkedList<Person>();
		for(Person person : persons){
			if(person.getGender().equals("Male")){
				males.add(person);
			}
		}
		return males;
	}

}
