package com.oops.encapsulation;

public class EncapMainDetails {

	public static void main(String[] args) {
		EncapDetails en = new EncapDetails();
		en.setId(12);
		en.setName("sufiyan");
		en.setAddress("sakinaka mumbai");
		int id = en.getId();
		String name = en.getName();
		String address = en.getAddress();
		System.out.println(" id : " + id + "\n name : " + name + " \n address : " + address);
	}
}
