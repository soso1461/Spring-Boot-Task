package com.leesoogwang.task.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatchRequestDto {
    
    private Integer scheduleNumber;

    @NotBlank
    private String scheduleName;    
    @NotBlank
    private String category;
    @NotBlank
    private String description;
    @NotBlank
    private String date;
    @NotBlank
    private String time;
    
}