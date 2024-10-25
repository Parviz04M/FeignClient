package org.pmlibrary.feignclient.client;

import org.pmlibrary.feignclient.dto.SportDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "sport", url = "https://sportapi7.p.rapidapi.com/api/v1/event/xdbsZdb/h2h/events")
public interface SportFeignClient {

    @GetMapping
    List<SportDto> getResource(
            @RequestHeader("x-rapidapi-host") String host,
            @RequestHeader("x-rapidapi-key") String apiKey
    );
}