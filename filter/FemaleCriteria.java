package com.saftware.pattern.filter;

import java.util.LinkedList;
import java.util.List;

public class FemaleCriteria implements Criteria {

	public List<Person> filter(List<Person> persons) {
		List<Person> females = new LinkedList<Person>();
		for(Person person : persons){
			if(person.getGender().equals("Female")){
				females.add(person);
			}
		}
		return females;

	}

}
