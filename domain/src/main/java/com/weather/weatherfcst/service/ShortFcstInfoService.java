package com.weather.weatherfcst.service;

import com.weather.weatherfcst.external.ShortWeatherFcstClient;
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
public class ShortFcstInfoService {

    private final ShortWeatherFcstClient shortWeatherFcstClient;

    public ResponseEntity<String> getUltraSrtNcst(String pageNo, String numOfRows,
        String baseDate, String baseTime,
        String nx, String ny) {

        return shortWeatherFcstClient.getUltraSrtNcst(pageNo, numOfRows, baseDate, baseTime, nx, ny);
        /* todo Data Type 변환 */
    }
}
