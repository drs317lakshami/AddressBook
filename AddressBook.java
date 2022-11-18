package com.bridgelabz;

public class AddressBooks {
	//city, state, zip, phoneNumber, email;

		public static void main(String[] args) {
			Contacts a = new Contacts( "DEVRAJ",  "SHARMA",  "DHAKA",  "MOTHIRI",  "BIHAR",  "845418",  "7562047829",  "devrajkumar3@gmail.com");
			
			System.out.println(a.getFirstName());
			System.out.println(a.getLastName());
			System.out.println(a.getAddress());
			System.out.println(a.getCity());
			System.out.println(a.getState());
			System.out.println(a.getZip());
			System.out.println(a.getPhoneNumber());
			System.out.println(a.getEmail());
			

	}

}
