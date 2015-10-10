package scarmy.za.ac.cput.ScArmyBuilder.repositories.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestDeleteArmy;

/**
 * Created by Xeno on 2015/09/28.
 */
public class RestDeleteArmyAPI implements RestDeleteArmy<ArmyObject> {
    final String BASE_URL = "http://sc2army-andre92.rhcloud.com/api/services/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    public void deleteT(ArmyObject armyObject){
        final String url = BASE_URL+"terran/delete/"+armyObject.getId();
        restTemplate.delete(url,armyObject.getId());
    }

    public void deleteP(ArmyObject armyObject){
        final String url = BASE_URL+"protoss/delete/"+armyObject.getId();
        restTemplate.delete(url,armyObject.getId());
    }

    public void deleteZ(ArmyObject armyObject){
        final String url = BASE_URL+"zerg/delete/"+armyObject.getId();
        restTemplate.delete(url,armyObject.getId());
    }
}
