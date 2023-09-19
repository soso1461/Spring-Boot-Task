package com.leesoogwang.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeleteResponseDto extends ResponseDto {
        
    public DeleteResponseDto(String code, String message) {
        super(code, message);
    }

}
