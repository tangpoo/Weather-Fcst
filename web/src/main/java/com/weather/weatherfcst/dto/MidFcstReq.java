package com.weather.weatherfcst.dto;

import lombok.Data;

@Data
public class MidFcstReq {

    private String serviceKey;
    private String pageNo;
    private String numOfRows;
    private String dataType;
    private String stnId;
    private String tmFc;
}
