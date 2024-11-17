package com.weather.weatherfcst.service;

import com.weather.weatherfcst.external.WthrWrnClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WthrWrnService {

    private final WthrWrnClient wthrWrnClient;

    public ResponseEntity<String> getWthrWrnList(String pageNo, String numOfRows, String stnId,
        String fromTmFc, String toTmFc) {

        return wthrWrnClient.getWthrWrnList(pageNo, numOfRows, stnId, fromTmFc, toTmFc);

        /* todo Data Type 변환 */
    }
}
