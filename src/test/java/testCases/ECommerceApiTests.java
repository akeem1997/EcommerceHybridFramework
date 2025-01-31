package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import apiEndpoints.EcommerceEndPoints;
import io.restassured.response.Response;

public class ECommerceApiTests {
	
	@Test(priority = 1)
	public void getAllProducts() {
		Response res =EcommerceEndPoints.getProducts();
		
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test(priority = 2)
	public void postToAllProductLists() {
		Response res = EcommerceEndPoints.PostProducts();
		String getResCode = res.jsonPath().get("message").toString();
		Assert.assertEquals(getResCode,  "This request method is not supported.");
		Assert.assertEquals(res.getStatusCode(), 405);
	}
	
	@Test(priority = 3)
	public void getAllBrandList() {
		Response res = EcommerceEndPoints.getBrands();
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test(priority = 4)
	public void putToAllBrandList() {
		Response res = EcommerceEndPoints.putProduct();
		String getResCode = res.jsonPath().get("message").toString();
		Assert.assertEquals(getResCode,  "This request method is not supported.");
		Assert.assertEquals(res.getStatusCode(), 405);
		
	}
	
	
	
	

}
