package by.stormnet.api;

import by.stormnet.api.entities.UserService;
import by.stormnet.automation.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest {
    private UserService userService = new UserService();

    @Test
    public void getAllusersTest(){
        Response response = userService.getUserList();
        int code = response.getCode();
        boolean containsEmail = response.getBody().contains("george.bluth@reqres.in");
        Assert.assertTrue(code == 200 && containsEmail,"Users are not availiable");
    }

    @Test
    public void createNewUserTest(){
        String newUser = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
        Response response = userService.createNewUser(newUser);
        int code = response.getCode();
        boolean containUserName = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 201 && containUserName, "User is not created");
    }
}
