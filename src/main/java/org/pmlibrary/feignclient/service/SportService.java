package org.pmlibrary.feignclient.service;

import org.pmlibrary.feignclient.client.SportFeignClient;
import org.pmlibrary.feignclient.dto.SportDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportService {
    private final SportFeignClient sportFeignClient;

    public SportService(SportFeignClient sportFeignClient) {
        this.sportFeignClient = sportFeignClient;
    }

    public List<SportDto> fetchDataFromExternalService() {
        String host = "sportapi7.p.rapidapi.com";
        String apiKey = "1f44f25524msh9d55f19cfcd782fp1eadcejsndb3177ccf988";
        return sportFeignClient.getResource(host, apiKey);
    }
}