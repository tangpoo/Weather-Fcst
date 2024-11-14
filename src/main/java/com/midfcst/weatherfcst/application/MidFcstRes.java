package com.midfcst.weatherfcst.application;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

public class MidFcstRes {

    private Response response;

    @Data
    public static class Response {

        private Header header;
        private Body body;
    }

    @Data
    public static class Header {

        private String resultCode;
        private String resultMsg;
    }

    @Data
    public static class Body {

        private String dataType;
        private Items items;
        private int pageNo;
        private int numOfRows;
        private int totalCount;
    }

    @Data
    public static class Items {

        @JsonProperty("item") // JSON 응답의 key에 매핑
        private List<Item> item;
    }

    @Data
    public static class Item {

        @JsonProperty("wfSv") // JSON 응답의 key에 매핑
        private String weatherSummary;
    }
}
