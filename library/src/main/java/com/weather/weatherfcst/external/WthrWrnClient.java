package com.weather.weatherfcst.external;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@RequiredArgsConstructor
public class WthrWrnClient {

    private final RestTemplate restTemplate;
    private final String baseUrl = "http://apis.data.go.kr/1360000/WthrWrnInfoService";
    private final String type = "JSON";
    @Value("${service-key}")
    private String serviceKey;

    public ResponseEntity<String> getWthrWrnList(String pageNo, String numOfRows, String stnId,
        String fromTmFc, String toTmFc) {

        String uri = UriComponentsBuilder.fromHttpUrl(baseUrl + "/getWthrWrnList")
            .queryParam("serviceKey", serviceKey)
            .queryParam("dataType", type)
            .queryParam("pageNo", pageNo)
            .queryParam("numOfRows", numOfRows)
            .queryParam("stnId", stnId)
            .queryParam("fromTmFc", fromTmFc)
            .queryParam("toTmFc", toTmFc)
            .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
    }
}
