package com.person;
import java.io.*;
import java.util.*;

import com.address.Address;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		System.out.println("Constructor of "+this.getClass());
		this.name = name;
		this.age = age;
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
}
