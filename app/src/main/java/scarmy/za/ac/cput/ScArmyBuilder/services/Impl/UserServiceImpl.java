package scarmy.za.ac.cput.ScArmyBuilder.services.Impl;

import scarmy.za.ac.cput.ScArmyBuilder.model.User;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestAPI;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.rest.RestUserAPI;
import scarmy.za.ac.cput.ScArmyBuilder.services.UserService;

/**
 * Created by Xeno on 2015/09/27.
 */
public class UserServiceImpl implements UserService {
    final RestAPI<User> rest = new RestUserAPI();

    public String check(User entity){
        return rest.get(entity);
    }
    public String save(User entity){
        return rest.post(entity);
    }


}
