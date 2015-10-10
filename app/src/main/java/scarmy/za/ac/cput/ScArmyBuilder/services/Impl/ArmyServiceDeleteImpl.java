package scarmy.za.ac.cput.ScArmyBuilder.services.Impl;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestDeleteArmy;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.rest.RestDeleteArmyAPI;
import scarmy.za.ac.cput.ScArmyBuilder.services.ArmyDeleteService;
import scarmy.za.ac.cput.ScArmyBuilder.services.ServiceADelete;

/**
 * Created by Xeno on 2015/09/28.
 */
public class ArmyServiceDeleteImpl implements ArmyDeleteService {

    final RestDeleteArmy<ArmyObject> rest = new RestDeleteArmyAPI();

    public void deleteT(ArmyObject entity) {
        rest.deleteT(entity);
    }
    public void deleteP(ArmyObject entity) {
        rest.deleteP(entity);
    }
    public void deleteZ(ArmyObject entity) {
        rest.deleteZ(entity);
    }
}
