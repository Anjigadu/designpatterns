package com.saftware.pattern.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria firstCriteria;
	private Criteria otherCriteria;
	public AndCriteria(Criteria firstCriteria,Criteria otherCriteria){
		this.firstCriteria = firstCriteria;
		this.otherCriteria = otherCriteria;
	}
	public List<Person> filter(List<Person> persons) {
		List<Person> filteredPersons = this.firstCriteria.filter(persons);
		filteredPersons = this.otherCriteria.filter(filteredPersons);
		return filteredPersons;
	}

}
