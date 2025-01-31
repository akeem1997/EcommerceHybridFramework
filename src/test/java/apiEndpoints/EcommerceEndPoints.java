package apiEndpoints;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class EcommerceEndPoints {
	
	public static Response getProducts() {
        Response res = given().when().get(routes.Get_All_Products_Lists);
         return res;
}
	
	public static Response PostProducts() {
		Response res = given().when().post(routes.Post_To_All_Product_Lists);
		return res;
	}
	
	public static Response putProduct() {
		Response res = given().when().put(routes.Put_To_All_Brand_Lists);
		return res;
	}
	
	public static Response getBrands() {
        Response res = given().when().get(routes.Get_All_Brands_Lists);
         return res;
}

}
