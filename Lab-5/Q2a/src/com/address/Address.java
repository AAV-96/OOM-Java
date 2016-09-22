package com.address;
import java.io.*;
import java.util.*;

public class Address {
	String address;
	
	public Address(String address) {
		System.out.println("Constructor of "+this.getClass());
		this.address = address;
		System.out.println("Address: "+this.address);
	}
}
