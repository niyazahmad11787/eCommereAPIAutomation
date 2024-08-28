package com.qa.ecommapi.specbuilder;

import org.openqa.selenium.remote.http.Route;

import com.qa.ecommapi.applicationapi.ecommerceAPIs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specbuilder{

	 public static RequestSpecification getRequestSpecification() {
	        return new RequestSpecBuilder().
	                setBaseUri(com.qa.ecommapi.applicationapi.Route.BASEURL).
	                setContentType(ContentType.JSON).
	                log(LogDetail.ALL).build();
	    }


	    public static ResponseSpecification getResponseSpecification(){
	        return new ResponseSpecBuilder()
	                .log(LogDetail.ALL)
	                .build();
	    }
}
