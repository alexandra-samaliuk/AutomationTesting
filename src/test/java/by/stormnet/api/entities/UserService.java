package by.stormnet.api.entities;

import by.stormnet.automation.core.FrameWorkHttpClient;
import by.stormnet.automation.core.Response;

public class UserService extends AbstractService {
    private FrameWorkHttpClient client = new FrameWorkHttpClient();
    private String userUrl = baseAppUrl + "/api/users";

    public Response getUserList(){
        System.out.println("Get user list request ");
        return client.doGet(userUrl);
    }

    public Response createNewUser (String userData){
        System.out.println("Create new user with data " + userData);
        return client.doPost(userUrl, userData);
    }
}
