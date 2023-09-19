package com.leesoogwang.task.controller;

import javax.validation.Valid;

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
import com.leesoogwang.task.dto.response.DeleteResponseDto;
import com.leesoogwang.task.dto.response.GetResponseDto;
import com.leesoogwang.task.dto.response.PatchResponseDto;
import com.leesoogwang.task.dto.response.PostResponseDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    // 일정 불러오기
    @GetMapping("{taskNumber}")
    public ResponseEntity<GetResponseDto> getSchedule(
        @PathVariable("taskNumber") Integer taskNumber
    ) {
        return null;
    }

    
    // 일정 작성
    @PostMapping("")
    public ResponseEntity<PostResponseDto> postSchedule(
        @RequestBody @Valid PostRequestDto requestBody
    ) {
        return null;
    }
    
    // 일정 수정
    @PatchMapping("/{taskNumber}")
    public ResponseEntity<PatchResponseDto> patchSchddule(
        @PathVariable("taskNumber") Integer taskNumber, 
        @RequestBody @Valid PatchRequestDto requestBody
    ) {
        return null;
    }

    // 일정 삭제
    @DeleteMapping("/{taskNumber}")
    public ResponseEntity<DeleteResponseDto> deleteSchedule(
        @PathVariable("taskNumber") Integer taskNumber
    ) {
        return null;
    }
    
}