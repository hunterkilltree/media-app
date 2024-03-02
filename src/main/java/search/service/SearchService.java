package search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import search.resource.SearchResource;

@Service
public class SearchService {

    @Autowired
    RestTemplate restTemplate;

    // I want to map entity related Class resource,
    // and return that resource as type in item of SearchResource
    public <T>SearchResource<T> getResponseOnEntity() {
        return restTemplate
                .exchange(" http://localhost:8080/products",
                        HttpMethod.GET, entity, String.class)
                .getBody();
        return null;
    }
}
