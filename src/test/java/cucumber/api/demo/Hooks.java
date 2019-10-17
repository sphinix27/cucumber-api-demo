package cucumber.api.demo;

import io.cucumber.java.Before;
import io.restassured.response.Response;

/**
 * Hooks
 */
public class Hooks {

    private Helper helper;

    public Hooks(Helper helper) {
        this.helper = helper;
    }

    @Before("@create-user")
    public void createUser() {
        String endpoint = "public-api/users/[userId]";
        String body = "{\"first_name\":\"Brian\",\"last_name\":\"Ratke\",\"gender\":\"male\",\"email\":\"lew19@roberts2.com\",\"status\":\"active\"}";
        Response response = this.helper.getRequests().post(endpoint, body);
        this.helper.setUserId(response.asString());
                
    }
}