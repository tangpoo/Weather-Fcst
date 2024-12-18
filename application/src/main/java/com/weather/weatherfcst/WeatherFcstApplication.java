package com.weather.weatherfcst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.weather.weatherfcst")
public class WeatherFcstApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherFcstApplication.class, args);
    }

}
