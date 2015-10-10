package scarmy.za.ac.cput.ScArmyBuilder.repositories.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import scarmy.za.ac.cput.ScArmyBuilder.model.User;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestAPI;

/**
 * Created by Xeno on 2015/09/27.
 */
public class RestUserAPI implements RestAPI<User> {
    final String BASE_URL="http://sc2army-andre92.rhcloud.com/api/services/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    public String get(User entity){
        final String url = BASE_URL+"login/login";
        HttpEntity<User> requestEntity = new HttpEntity<User>(entity);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    public String post(User entity){
        final String url = BASE_URL+"login/create";
        HttpEntity<User> requestEntity = new HttpEntity<User>(entity);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }


}
