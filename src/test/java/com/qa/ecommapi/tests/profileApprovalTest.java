package com.qa.ecommapi.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import com.qa.ecommap.util.*;
import com.qa.ecommap.util.CustomerDetails;
import com.qa.ecommapi.applicationapi.Route;
import com.qa.ecommapi.applicationapi.ecommerceAPIs;
import com.qa.ecommapi.payloads.profileApproval;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class profileApprovalTest {
	

	@Test(priority = 1)
	public void conresProfileApproval(){
	

        try {
        	CustomerDetails details=new CustomerDetails();
        	Customer customer=details.getCustomerDetails();
            Map<String, Object> payload = profileApproval.profilePayload(customer);
            
            Response response= ecommerceAPIs.post((HashMap<String, Object>)payload ,Route.PROFILEAPPROVAL,Route.XAPIKEY,Route.COOKIE);
            assertThat(response.statusCode(),equalTo(200));
            assertThat(JsonPath.from(response.asString()).getString("status"),equalTo("success"));


        }catch (Exception e){
            throw new RuntimeException("ABORT! Failed to get executed.");
        }

	}
}
