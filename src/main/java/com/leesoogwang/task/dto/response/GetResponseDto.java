package com.leesoogwang.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetResponseDto extends ResponseDto {
    
    private Integer scheduleNumber;
    private String name;
    private String category;
    private String description;
    private String date;
    private String time;

}