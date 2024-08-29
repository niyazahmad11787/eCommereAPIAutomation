package com.qa.ecommapi.payloads;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.ecommap.util.Customer;
public class profileApproval {

	 public static Map<String, Object> profilePayload(Customer customerData) {
	        // Creating the main customer HashMap
	        Map<String, Object> customer = new HashMap<>();
	        customer.put("mobile", customerData.getPhone());
	        customer.put("customer_type", "CONTRACTOR");
	        customer.put("sub_customer_type", "Architect");
	        customer.put("email", customerData.getEmail());
	        customer.put("first_name", customerData.getFirstName());
	        customer.put("last_name", "Contractor");
	        customer.put("gst_number", null);
	        customer.put("pan_number", null);
	        customer.put("gst_address", null);
	        customer.put("trade_name", "Test Con");
	        customer.put("business_name", "Test Con");
	        customer.put("is_active", true);
	        customer.put("is_sales_person", false);
	        customer.put("business_license_name", null);
	        customer.put("business_license_number", null);
	        customer.put("alternate_mobile", null);
	        customer.put("employee_email", "testcon@gmail.com");
	        customer.put("shop_open", "");
	        customer.put("shop_close", "");

	        // Creating the list of address maps
	        List<Map<String, Object>> addresses = new ArrayList<>();

	        // Billing Address
	        Map<String, Object> billingAddress = new HashMap<>();
	        billingAddress.put("address_type", "Billing");
	        billingAddress.put("address1", "New Home");
	        billingAddress.put("address2", "");
	        billingAddress.put("city", "Noida");
	        billingAddress.put("zipcode", "201308");
	        billingAddress.put("state_name", "Uttar Pradesh");

	        // Shipping Address
	        Map<String, Object> shippingAddress = new HashMap<>();
	        shippingAddress.put("address_type", "Shipping");
	        shippingAddress.put("address1", "New Company");
	        shippingAddress.put("address2", "");
	        shippingAddress.put("city", "Noida");
	        shippingAddress.put("zipcode", "201308");
	        shippingAddress.put("state_name", "Uttar Pradesh");

	        // Adding addresses to the list
	        addresses.add(billingAddress);
	        addresses.add(shippingAddress);

	        // Adding the addresses list to the main customer map
	        customer.put("addresses", addresses);

	        return customer;
	    }
	}

	

