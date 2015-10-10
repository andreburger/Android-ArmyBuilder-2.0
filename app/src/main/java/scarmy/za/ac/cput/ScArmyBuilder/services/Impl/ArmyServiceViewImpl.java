package scarmy.za.ac.cput.ScArmyBuilder.services.Impl;

import java.util.List;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestDisplayArmies;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.rest.RestDisplayArmiesAPI;
import scarmy.za.ac.cput.ScArmyBuilder.services.ArmyViewService;

/**
 * Created by Xeno on 2015/09/28.
 */
public class ArmyServiceViewImpl implements ArmyViewService{
    final RestDisplayArmies<ArmyObject> rest = new RestDisplayArmiesAPI();

    public List<ArmyObject> viewT() {
        return rest.getArmyT();
    }
    public List<ArmyObject> viewP() {
        return rest.getArmyP();
    }
    public List<ArmyObject> viewZ() {
        return rest.getArmyZ();
    }
}
