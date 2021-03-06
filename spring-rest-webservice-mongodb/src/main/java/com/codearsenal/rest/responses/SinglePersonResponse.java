package com.codearsenal.rest.responses;

import com.codearsenal.model.Person;

//	http://CodeArsenal.net/2015/10/java-spring-restful-web-service-mongodb.html

public class SinglePersonResponse {

	private boolean success;
	private Person person;
	
	public SinglePersonResponse(boolean success, Person person) {
		this.success = success;
		this.person = person;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Person getPersons() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
