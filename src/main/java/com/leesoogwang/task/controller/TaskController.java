package com.leesoogwang.task.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leesoogwang.task.dto.request.PatchRequestDto;
import com.leesoogwang.task.dto.request.PostRequestDto;
import com.leesoogwang.task.dto.response.ResponseDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    // 일정 불러오기
    @GetMapping("{taskNumber}")
    public ResponseEntity<ResponseDto.getScheduleDto> getScheduleEntity(@PathVariable Integer taskNumber) {
        ResponseDto.getScheduleDto responseBody = new ResponseDto.getScheduleDto("0", "0", null, null, null, null, null, null);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    
    // 일정 작성
    @PostMapping("")
    public ResponseEntity<ResponseDto.postScheduleDto> postScheduleEntity(@Valid @RequestBody PostRequestDto requestBody) {
        ResponseDto.postScheduleDto responseBody = new ResponseDto.postScheduleDto("1", "1");
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
    
    // 일정 수정
    @PatchMapping("/{taskNumber}")
    public ResponseEntity<ResponseDto.patchScheduleDto> patchScheduleEntity(@PathVariable Integer taskNumber, @Valid @RequestBody PatchRequestDto requestBody) {
        ResponseDto.patchScheduleDto responseBody = new ResponseDto.patchScheduleDto("2", "2");
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    // 일정 삭제
    @DeleteMapping("/{taskNumber}")
    public ResponseEntity<ResponseDto.deleteSceduleDto> deleteScheduleEntity(@PathVariable Integer taskNumber) {
        ResponseDto.deleteSceduleDto responseBody = new ResponseDto.deleteSceduleDto("3", "3");
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
    
}