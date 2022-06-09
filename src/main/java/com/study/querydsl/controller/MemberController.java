package com.study.querydsl.controller;

import com.study.querydsl.dto.MemberSeachCondition;
import com.study.querydsl.dto.MemberTeamDto;
import com.study.querydsl.repository.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberJpaRepository memberJpaRepository;

    @GetMapping("/v1/members")
    public List<MemberTeamDto> searchMemberV1(MemberSeachCondition condition) {
        return memberJpaRepository.search(condition);
    }
}
