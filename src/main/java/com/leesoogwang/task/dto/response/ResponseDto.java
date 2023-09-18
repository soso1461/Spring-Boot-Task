package com.leesoogwang.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class ResponseDto {

    @Getter
    @AllArgsConstructor
    public static class getScheduleDto {
        private String code;
        private String message;
        private Integer scheduleNumber;
        private String name;
        private String category;
        private String description;
        private String date;
        private String time;
    }
    
    @Getter
    @AllArgsConstructor
    public static class postScheduleDto {
        private String code;
        private String message;
    }

    @Getter
    @AllArgsConstructor
    public static class patchScheduleDto {
        private String code;
        private String message;
    }

    @Getter
    @AllArgsConstructor
    public static class deleteSceduleDto {
        private String code;
        private String message;
    }
}