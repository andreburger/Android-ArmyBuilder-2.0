package scarmy.za.ac.cput.ScArmyBuilder.repositories.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestCreateArmy;

/**
 * Created by Xeno on 2015/09/27.
 */
public class RestArmyAPI implements RestCreateArmy<ArmyService> {
    final String BASE_URL = "http://sc2army-andre92.rhcloud.com/api/services/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    public String postT(ArmyService armyService) {
        final String url = BASE_URL + "terran/create";
        HttpEntity<ArmyService> requestEntity = new HttpEntity<ArmyService>(armyService);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    public String postP(ArmyService armyService) {
        final String url = BASE_URL + "protoss/create";
        HttpEntity<ArmyService> requestEntity = new HttpEntity<ArmyService>(armyService);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    public String postZ(ArmyService armyService) {
        final String url = BASE_URL + "zerg/create";
        HttpEntity<ArmyService> requestEntity = new HttpEntity<ArmyService>(armyService);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }




}
