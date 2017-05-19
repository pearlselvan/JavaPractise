package RestAssured;
//import static com.jayway.restassured.RestAssured.expect;
//import static com.jayway.restassured.RestAssured.given;
//import static com.jayway.restassured.RestAssured.put;

import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.expect;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;
import static io.restassured.path.json.JsonPath.from;
//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.http.ContentType;
//import com.jayway.restassured.response.Response;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;

/**
 * Created by muthuselvan on 5/11/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Current path  : " +path);
    }


    @Test
    public void testGoogle() {
//        Assert.assertEquals(200,given().when().get("https://www.google.com").thenReturn().getStatusCode());
        expect().statusCode(given().when().get("https://www.google.com").thenReturn().getStatusCode());
    }

    public static RequestSpecification getRequestSpecification() {
        return RestAssured.given().contentType(ContentType.JSON);
    }

    @Test
    public void postExample()
    {
        RestAssured.baseURI="https://10.61.232.131:4443";
//        String url = "https://10.61.232.131:4443/xenmobile/api/v1/authentication/login";
        String login = "/xenmobile/api/v1/authentication/login";
        RestAssured.useRelaxedHTTPSValidation();

        String user = "administrator";
        String pass = "password" ;

        String json = "{\n" +
                "\"login\": \"administrator\",\n" +
                "\"password\": \"password\"\n" +
                "}";
        System.out.println("JSON " +json);
//        Response response = given().contentType("application/json").accept(ContentType.JSON).body(json).when().post(login);
        Response response = given().spec(getRequestSpecification()).accept(ContentType.JSON).body(json).when().post(login);
        String body = response.getBody().asString();
        String auth = from(response.asString()).get("auth_token");
        System.out.println(body);
        System.out.println("Auth : " +auth);

        Assert.assertEquals(response.getStatusCode(), 200);







    }


}
