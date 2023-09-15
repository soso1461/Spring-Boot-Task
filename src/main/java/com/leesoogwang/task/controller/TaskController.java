package com.leesoogwang.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leesoogwang.task.dto.request.RequestBodyDto;


@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @GetMapping("{taskNumber}")
    public String getSchedule(String taskNumber) {
        return "taskNumber는 " + taskNumber;
    }

    @PostMapping("")
    public String postSchedule(
        @RequestBody RequestBodyDto requestBody
    ) {
        return "일정이름: " + requestBody.getScheduleName() + "\n카테고리: " + requestBody.getCategory() + "\n설명: " 
        + requestBody.getDescription() + "\n날짜: " + requestBody.getDate() + "\n시간: " + requestBody.getTime();
    }
    
    @PatchMapping("/{taskNumber}")
    public String patchSchedule(
        @RequestBody RequestBodyDto requestBody) {
        return "일정이름: " + requestBody.getScheduleName() + "\n카테고리: " + requestBody.getCategory() + "\n설명: " 
        + requestBody.getDescription() + "\n날짜: " + requestBody.getDate() + "\n시간: " + requestBody.getTime();
    }

    @DeleteMapping("/{taskNumber}")
    public String deleteScedule(String taskNumber) {
        return "taskNumber는 " + taskNumber;
    }


    
}


// 4. Task 컨트롤러를 작성한다. 
// (단, 해당 컨드롤러는 JSON 형식의 데이터를 응답하는 컨트롤러이며 URL 패턴은 프로토콜://호스트:포트/api/v1/task/** 이다)
// 5. Task 컨트롤러에 일정 불러오기 
// (GET 프로토콜://호스트:포트/api/v1/task/{taskNumber}), 
// 일정 작성하기 (POST 프로토콜://호스트:포트/api/v1/task), 
// 일정 수정하기 (PATCH 프로토콜://호스트:포트/api/v1/task/{taskNumber}), 
// 일정 삭제하기 (DELETE 프로토콜://호스트:포트/api/v1/task/{taskNumber}) 메서드를 작성한다.
// 5 - 1. 일정 작성하기 요청에서는 데이터를 '일정이름', '카테고리', '설명', '날짜', '시간'을 입력받는다. (모두 문자열)5 - 2. 일정 수정하기 요청에서는 데이터를 '일정이름', '카테고리', '설명', '날짜', '시간'을 입력받는다. (모두 문자열)