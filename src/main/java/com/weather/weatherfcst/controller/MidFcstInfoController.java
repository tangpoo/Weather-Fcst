package com.weather.weatherfcst.controller;

import com.weather.weatherfcst.service.MidFcstInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class MidFcstInfoController {

    private final MidFcstInfoService midFcstInfoService;

    @GetMapping(value = "/mid-fcst")
    public ResponseEntity<String> getMidFcst(
        @RequestParam String pageNo,
        @RequestParam String numOfRows,
        @RequestParam String stnId,
        @RequestParam String tmFc
    ) {
        return midFcstInfoService.getMidFcst(pageNo, numOfRows, stnId, tmFc);
    }
}