package com.weather.weatherfcst.service;

import com.weather.weatherfcst.external.MidWeatherFcstClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@RequiredArgsConstructor
public class MidFcstInfoService {

    private final MidWeatherFcstClient midWeatherFcstClient;

    public ResponseEntity<String> getMidFcst(String pageNo, String numOfRows, String stnId,
        String tmFc) {

        return midWeatherFcstClient.getMidFcst(pageNo, numOfRows, stnId, tmFc);

        /* todo Data Type 변환 */
    }
}