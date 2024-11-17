package com.weather.weatherfcst.controller;

import com.weather.weatherfcst.service.WthrWrnService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class WthrWrnController {

    private final WthrWrnService wthrWrnService;

    @GetMapping(value = "/wrn")
    public ResponseEntity<String> getWthrWrnList(
        @RequestParam String pageNo,
        @RequestParam String numOfRows,
        @RequestParam String stnId,
        @RequestParam String fromTmFc,
        @RequestParam String toTmFc

    ) {
        return wthrWrnService.getWthrWrnList(pageNo, numOfRows, stnId, fromTmFc, toTmFc);
    }
}
