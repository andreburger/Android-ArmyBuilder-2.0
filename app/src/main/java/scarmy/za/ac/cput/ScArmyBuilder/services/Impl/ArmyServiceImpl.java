package scarmy.za.ac.cput.ScArmyBuilder.services.Impl;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestCreateArmy;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.rest.RestArmyAPI;
import scarmy.za.ac.cput.ScArmyBuilder.services.ArmyUnitsService;

/**
 * Created by Xeno on 2015/09/27.
 */
public class ArmyServiceImpl implements ArmyUnitsService {
    final RestCreateArmy<ArmyService> rest = new RestArmyAPI();

    public String createT(ArmyService entity){
        return rest.postT(entity);
    }
    public String createP(ArmyService entity){
        return rest.postP(entity);
    }
    public String createZ(ArmyService entity){
        return rest.postZ(entity);
    }
}
