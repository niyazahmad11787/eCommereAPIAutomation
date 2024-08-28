package com.qa.ecommapi.applicationapi;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;
import com.qa.ecommapi.specbuilder.*;

import static io.restassured.RestAssured.given;

public class ecommerceAPIs {
	

	 public static Response post( HashMap<String, Object> payload,String path,String xApiKey,String Cookie){

	        return given(specbuilder.getRequestSpecification())
	                .body(payload).
	                header("x-api-key",xApiKey).
	                header("Cookie",Cookie).
	                when()
	                .post(path)
	                .then()
	                .spec(specbuilder.getResponseSpecification()).
	                assertThat().statusCode(200).extract()
	                .response();


	    }
	}

