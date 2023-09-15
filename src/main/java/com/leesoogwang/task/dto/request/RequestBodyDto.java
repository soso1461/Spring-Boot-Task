package com.leesoogwang.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestBodyDto {
    private String scheduleName;
    private String category;
    private String description;
    private String date;
    private String time;
}
