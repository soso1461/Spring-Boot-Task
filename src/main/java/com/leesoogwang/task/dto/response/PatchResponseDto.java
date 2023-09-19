package com.leesoogwang.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PatchResponseDto extends ResponseDto {
        
    public PatchResponseDto(String code, String message) {
        super(code, message);
    }

}
