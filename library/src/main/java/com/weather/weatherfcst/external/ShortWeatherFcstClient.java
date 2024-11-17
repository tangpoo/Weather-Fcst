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
public class ShortWeatherFcstClient {
    private final RestTemplate restTemplate;
    private final String baseUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0";
    private final String type = "JSON";
    @Value("${service-key}")
    private String serviceKey;

    public ResponseEntity<String> getUltraSrtNcst(String pageNo, String numOfRows,
        String baseDate, String baseTime,
        String nx, String ny) {

        String uri = UriComponentsBuilder.fromHttpUrl(baseUrl + "/getUltraSrtNcst")
            .queryParam("serviceKey", serviceKey)
            .queryParam("pageNo", pageNo)
            .queryParam("numOfRows", numOfRows)
            .queryParam("dataType", type)
            .queryParam("baseDate", baseDate)
            .queryParam("baseTime", baseTime)
            .queryParam("nx", nx)
            .queryParam("ny", ny)
            .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
    }
}
