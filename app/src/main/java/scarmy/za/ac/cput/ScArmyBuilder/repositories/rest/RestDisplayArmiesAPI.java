package scarmy.za.ac.cput.ScArmyBuilder.repositories.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestDisplayArmies;

/**
 * Created by Xeno on 2015/09/28.
 */
public class RestDisplayArmiesAPI implements RestDisplayArmies<ArmyObject> {
    final String BASE_URL="http://sc2army-andre92.rhcloud.com/api/services/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    public List<ArmyObject> getArmyT() {
        List<ArmyObject> armies = new ArrayList<>();

        final String url = BASE_URL+"terran/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<ArmyObject[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ArmyObject[].class);
        ArmyObject[] results = responseEntity.getBody();

        for (ArmyObject army : results) {
            armies.add(army);
        }
        return armies;
    }

    public List<ArmyObject> getArmyP() {
        List<ArmyObject> armies = new ArrayList<>();

        final String url = BASE_URL+"protoss/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<ArmyObject[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ArmyObject[].class);
        ArmyObject[] results = responseEntity.getBody();

        for (ArmyObject army : results) {
            armies.add(army);
        }
        return armies;
    }

    public List<ArmyObject> getArmyZ() {
        List<ArmyObject> armies = new ArrayList<>();

        final String url = BASE_URL+"zerg/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<ArmyObject[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ArmyObject[].class);
        ArmyObject[] results = responseEntity.getBody();

        for (ArmyObject army : results) {
            armies.add(army);
        }
        return armies;
    }
}
