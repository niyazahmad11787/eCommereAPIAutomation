package com.qa.ecommap.util;

public class Customer {
	 
	    private String phone;
	    private String email;
	    private String firstName;

	    public Customer(String phone, String email, String firstName) {
	        this.phone = phone;
	        this.email = email;
	        this.firstName = firstName;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	}


