package io.app.core;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address4 implements Serializable{
	private String city, state, country;

	public Address4(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
