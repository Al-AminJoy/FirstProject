package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//This anotation is for craeting object when its called
//@Scope(value="prototype")
public class Alien {
	private int aId;
	private String aName;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("Constructor Called");
	}
	public int getaId() {
		return aId;
	}
	
	public String getaName() {
		return aName;
	}
	
	public String getTech() {
		return tech;
	}
	
	

	public Laptop getLaptop() {
		return laptop;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", tech=" + tech + "]";
	}
	public void show() {
		System.out.println("This Is Show");
		laptop.compile();
	}


}
