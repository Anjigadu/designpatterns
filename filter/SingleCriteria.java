package com.saftware.pattern.filter;

import java.util.LinkedList;
import java.util.List;

public class SingleCriteria implements Criteria {

	public List<Person> filter(List<Person> persons) {
		
		List<Person> singles = new LinkedList<Person>();
		for(Person person : persons){
			if(person.getMaritialStatus().equals("Single")){
				singles.add(person);
			}
		}
		return singles;
	}

}
