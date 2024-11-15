package com.weather.weatherfcst.controller;

import com.weather.weatherfcst.service.ShortFcstInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class ShortFcstInfoController {

    private final ShortFcstInfoService shortFcstInfoService;

    @GetMapping("/short-ncst")
    public ResponseEntity<String> getUltraSrtNcst(
        @RequestParam String pageNo,
        @RequestParam String numOfRows,
        @RequestParam String base_date,
        @RequestParam String base_time,
        @RequestParam String nx,
        @RequestParam String ny
    ) {
        return shortFcstInfoService.getUltraSrtNcst(pageNo, numOfRows, base_date, base_time, nx,
            ny);
    }
}
